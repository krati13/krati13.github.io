# System Design Document - In-Memory Order Management System

## 1. Architecture Overview

### Layered Architecture
```
┌─────────────────────────────────────────────┐
│         Client / API Layer                  │
├─────────────────────────────────────────────┤
│         Service Layer (Thread-Safe)         │
│   ┌─────────────────────────────────────┐   │
│   │    OrderService                     │   │
│   │    InventoryService                 │   │
│   └─────────────────────────────────────┘   │
├─────────────────────────────────────────────┤
│         Model Layer                         │
│   ┌─────────────────────────────────────┐   │
│   │    Order, OrderItem                 │   │
│   │    OrderStatus (State Machine)      │   │
│   │    InventoryItem                    │   │
│   └─────────────────────────────────────┘   │
├─────────────────────────────────────────────┤
│         Exception Handling                  │
│   OrderNotFoundException                    │
│   InsufficientInventoryException            │
│   InvalidOrderStateException                │
└─────────────────────────────────────────────┘
```

## 2. Component Responsibilities

### OrderService
**Responsibilities:**
- Create new orders
- Add/remove items from orders
- Manage order state transitions
- Confirm orders (with inventory validation)
- Ship, deliver, and cancel orders
- Retrieve order information

**Thread Safety Strategy:**
- Maintains ConcurrentHashMap of orders
- Each order has individual ReentrantReadWriteLock
- Write locks for state changes
- Read locks for queries

**Key Methods:**
```java
public Order createOrder(String orderId, String customerId)
public void addItemToOrder(String orderId, OrderItem item)
public void confirmOrder(String orderId)  // Validates inventory + transitions
public void cancelOrder(String orderId)   // Releases inventory
public OrderStatus getOrderStatus(String orderId)
```

### InventoryService
**Responsibilities:**
- Track product quantities
- Reserve inventory on order confirmation
- Release inventory on order cancellation
- Validate availability

**Thread Safety Strategy:**
- Global ReadWriteLock for inventory operations
- Multiple readers for stock checks
- Exclusive writer for reserve/release

**Key Methods:**
```java
public boolean hasAvailableQuantity(String productId, int qty)
public boolean reserveQuantity(String productId, int qty)
public void releaseQuantity(String productId, int qty)
```

## 3. State Machine Design

### Order State Transitions
```
┌─────────────────────────────────────────────────────────┐
│                                                         │
│  PENDING ──────────┬─────────────→ CONFIRMED            │
│    ↑               │                  │                 │
│    │               │                  ↓                 │
│    │               │              SHIPPED ──────→ DELIVERED
│    │               │                  ↑                 │
│    │               │                  │                 │
│    └───────────────┴──────────────────┴──→ CANCELLED   │
│                                                         │
└─────────────────────────────────────────────────────────┘
```

**State Descriptions:**
- **PENDING**: Order created, items can be added/removed
- **CONFIRMED**: Items reserved, inventory locked, cannot modify items
- **SHIPPED**: En route to customer
- **DELIVERED**: Final state, order complete
- **CANCELLED**: Final state, inventory released

**Transition Rules (Enum-based validation):**
```java
switch (currentStatus) {
    case PENDING -> allow(CONFIRMED, CANCELLED);
    case CONFIRMED -> allow(SHIPPED, CANCELLED);
    case SHIPPED -> allow(DELIVERED);
    case DELIVERED, CANCELLED -> allow(none);
}
```

## 4. Thread Safety Design

### Problem: Race Conditions in Concurrent Order Updates

**Scenario 1: Duplicate Confirmation**
```
Thread A: Order ORD-001, confirm()
    ├─ Check inventory: PROD-001 qty=5 ✓
    └─ Transition to CONFIRMED
    
Thread B: Order ORD-001, confirm() (concurrent)
    ├─ Check inventory: PROD-001 qty=5 ✓  (A hasn't updated yet)
    └─ Transition to CONFIRMED ❌ (INVALID STATE)
```

**Solution: Write Lock**
```java
ReadWriteLock lock = orderLocks.get(orderId);
lock.writeLock().lock();  // Only one thread at a time
try {
    if (!order.getStatus().canTransitionTo(CONFIRMED)) {
        throw InvalidOrderStateException;
    }
    // Entire operation is atomic
} finally {
    lock.writeLock().unlock();
}
```

### Scenario 2: Inventory Over-Reservation
```
Thread A: Reserve PROD-001 qty=5 (available=10)
Thread B: Reserve PROD-001 qty=6 (available=10 - race!)

Result: Both succeed, inventory goes negative ❌
```

**Solution: Inventory Write Lock**
```java
inventoryLock.writeLock().lock();
try {
    if (item.getAvailableQuantity() >= quantity) {
        item.reserve(quantity);  // Atomic
        return true;
    }
} finally {
    inventoryLock.writeLock().unlock();
}
```

### Lock Hierarchy
```
Global Lock (Rarely needed)
    ↓
OrderService Lock (per order)
    ↓
InventoryService Lock (global)
```

**Lock Ordering (Deadlock Prevention):**
1. Acquire order lock first
2. Then acquire inventory lock if needed
3. Always release in reverse order (LIFO)

## 5. Concurrency Control Strategies

### Read Operations (getOrder, getOrderItems)
```java
lock.readLock().lock();
try {
    return order.getItems();  // Multiple threads can read concurrently
} finally {
    lock.readLock().unlock();
}
```

**Benefit:** 
- Multiple threads can read simultaneously
- No performance degradation for read-heavy workloads

### Write Operations (confirmOrder, cancelOrder)
```java
lock.writeLock().lock();
try {
    // Exclusive access - only one writer at a time
} finally {
    lock.writeLock().unlock();
}
```

**Trade-offs:**
- ✓ Strong consistency
- ✓ Prevents race conditions
- ✗ Sequential writes (potential bottleneck)

## 6. Data Consistency Guarantees

### Inventory Reservation Atomicity
Problem: What if reserve succeeds but status transition fails?

Solution: Transaction-like behavior
```java
confirmOrder(String orderId) {
    lock.writeLock().lock();
    try {
        // Step 1: Validate state
        if (!canTransition(CONFIRMED)) throw exception;
        
        // Step 2: Reserve ALL items
        for (OrderItem item : order.getItems()) {
            boolean reserved = inventoryService.reserve(item);
            if (!reserved) {
                // Step 3: Rollback previously reserved items
                for (OrderItem rollbackItem : previousItems) {
                    inventoryService.release(rollbackItem);
                }
                throw InsufficientInventoryException;
            }
        }
        
        // Step 4: Transition state (only if all reserved)
        order.transitionStatus(CONFIRMED);
    } finally {
        lock.writeLock().unlock();
    }
}
```

**Consistency Properties:**
- All-or-nothing: Either all items reserved and status changed, or nothing
- Atomicity: No partial state
- Isolation: Other threads see consistent state

## 7. Exception Handling Strategy

### Exception Hierarchy
```
RuntimeException
    ├── OrderNotFoundException
    │   └── Used: When order doesn't exist
    ├── InsufficientInventoryException
    │   └── Used: When stock unavailable
    └── InvalidOrderStateException
        └── Used: When state transition invalid
```

### Exception in confirmOrder Flow
```java
try {
    orderService.confirmOrder(orderId);
} catch (InsufficientInventoryException e) {
    logger.warn("Cannot confirm order - insufficient inventory");
    // Retry later or notify customer
} catch (InvalidOrderStateException e) {
    logger.error("Cannot confirm order - invalid state");
    // Inform user order cannot be modified
} catch (OrderNotFoundException e) {
    logger.error("Order not found: " + orderId);
    // Handle 404
}
```

## 8. Performance Considerations

### Lock Contention
```
High Contention: Many threads updating same order
    → Use optimistic locking with retry
    
Low Contention: Few concurrent updates
    → Current ReentrantReadWriteLock is fine
```

### Inventory Lock Contention
```
Scenario: 100 concurrent orders confirming
    → All contend on global inventory lock
    → Solution: Shard inventory by product ID
```

**Sharded Inventory Example:**
```java
Map<String, ReadWriteLock> productLocks = new ConcurrentHashMap<>();
Map<String, InventoryItem> inventory = new ConcurrentHashMap<>();

public void reserve(String productId, int qty) {
    ReadWriteLock lock = productLocks.computeIfAbsent(
        productId, 
        k -> new ReentrantReadWriteLock()
    );
    lock.writeLock().lock();
    try {
        inventory.get(productId).reserve(qty);
    } finally {
        lock.writeLock().unlock();
    }
}
```

**Benefit:** Reduces contention by allowing concurrent updates to different products

## 9. Testing Strategy

### Unit Tests (Model Layer)
- Validate business rules
- Test immutability
- Verify state transitions

### Integration Tests (Service Layer)
- Test OrderService with InventoryService
- Verify inventory reservation/release
- Test exception scenarios

### Thread Safety Tests
- Concurrent order creation
- Race condition detection
- Stress tests (500+ concurrent operations)
- Inventory depletion scenarios

### Test Pattern: CountDownLatch for Synchronization
```java
CountDownLatch startLatch = new CountDownLatch(1);  // Gate
CountDownLatch endLatch = new CountDownLatch(10);   // Wait for all

for (int i = 0; i < 10; i++) {
    executor.submit(() -> {
        startLatch.await();  // Wait for go signal
        // Perform operation
        endLatch.countDown(); // Signal done
    });
}

startLatch.countDown();  // Start all threads together
endLatch.await();        // Wait for all to complete
```

## 10. Database Migration Strategy

### Current: In-Memory Storage
```
Order Map:    {orderId → Order}
Inventory Map: {productId → InventoryItem}
All in JVM heap
```

### Target: PostgreSQL/MySQL

#### Transaction Handling
```sql
BEGIN;
  -- Lock row for update (pessimistic)
  SELECT * FROM inventory WHERE product_id = ? FOR UPDATE;
  
  -- Check availability
  IF available >= quantity THEN
    -- Update inventory
    UPDATE inventory SET quantity = quantity - ? WHERE product_id = ?;
    
    -- Create order
    INSERT INTO orders (...) VALUES (...);
    
    -- Transition status
    UPDATE orders SET status = 'CONFIRMED' WHERE order_id = ?;
  ELSE
    ROLLBACK;  -- Automatic on error
  END IF;
COMMIT;
```

#### Isolation Level Selection
```
Use: REPEATABLE READ
├─ Prevents: Dirty reads, non-repeatable reads
├─ Allows: Phantom reads (acceptable for this use case)
└─ Performance: Good throughput

Use SERIALIZABLE only if:
└─ Phantom reads must be prevented
└─ Accept reduced throughput
```

#### Concurrency Control Comparison

| Mechanism | In-Memory | Database |
|-----------|-----------|----------|
| Read lock | ReentrantReadWriteLock | Shared lock (implicit) |
| Write lock | ReentrantReadWriteLock | Exclusive lock (FOR UPDATE) |
| Deadlock | Possible (rare) | Common (need monitoring) |
| Retry Logic | Not needed | Essential |
| Atomicity | Guaranteed in code | Guaranteed by transaction |
| Consistency | Application enforced | DB enforced + application |

#### Optimistic Locking Alternative
```java
@Entity
public class Order {
    @Version
    private Long version;  // Auto-incremented by JPA
}

// Update with version check
orderRepository.save(order);  // Fails if version changed
```

## 11. Design Issues & Interview Discussion

### Issue 1: Order Confirmation Bottleneck
**Problem:** Global inventory lock serializes all order confirmations

**Manifestation:**
```
Thread 1 confirms order A
└─ Holds inventory lock for 100ms
Thread 2 confirms order B
└─ Waits for thread 1 → Queued
Thread 3 confirms order C
└─ Waits for thread 2 → Queued

Throughput: 1 order / 100ms = 10 orders/sec
```

**Solutions:**
1. **Sharded Locking** - Lock per product
2. **Optimistic Locking** - Retry on conflict
3. **Async Processing** - Queue confirmations
4. **Database Transaction** - Let DB handle it

### Issue 2: Inventory Over-Booking Race
**Old problem (hypothetical without locks):**
```
2 concurrent confirmations for same product (qty=1 available):
  Thread A: Check qty (qty=1 ✓) → Transition
  Thread B: Check qty (qty=1 ✓) → Transition
  Result: Both succeed, inventory negative ❌
```

**Current solution:** Write lock prevents this

**Database solution:** 
```sql
UPDATE inventory 
SET quantity = quantity - ?
WHERE product_id = ? AND quantity >= ?;

-- Only succeeds if condition met (atomic check-and-update)
```

### Issue 3: Cascading Failures
**Scenario:** Inventory service slow, all order confirmations hang

**Solution:** Circuit breaker pattern
```java
@CircuitBreaker(
    failureThreshold = 5,
    delay = 1000,
    successThreshold = 2
)
public void confirmOrder(String orderId) {
    // If fails 5 times, open circuit for 1 second
    // Fail fast instead of hanging
}
```

## 12. Monitoring & Observability

### Metrics to Track
```
1. Order Operations:
   - Create rate, Confirm rate, Cancel rate
   - Confirmation success rate
   - Average confirmation latency

2. Inventory:
   - Product stock levels
   - Reservation rate
   - Failed reservation attempts

3. Thread Safety:
   - Lock acquisition latency
   - Lock contention ratio
   - Thread pool queue depth

4. Errors:
   - InsufficientInventoryException rate
   - InvalidOrderStateException rate
   - OrderNotFoundException rate
```

### Example Metrics Code
```java
Timer confirmTimer = meterRegistry.timer("orders.confirm.duration");

confirmTimer.record(() -> {
    try {
        orderService.confirmOrder(orderId);
    } catch (InsufficientInventoryException e) {
        meterRegistry.counter("orders.confirm.failed.inventory").increment();
    }
});
```

## 13. Future Enhancements

### 1. Distributed Locks (For Microservices)
```java
// Use Redis for cross-service locks
RedissonClient redisson = Redisson.create();
RLock lock = redisson.getLock("order:" + orderId);
```

### 2. Event Sourcing
```
Events:
  - OrderCreatedEvent(orderId, customerId, timestamp)
  - ItemAddedEvent(orderId, productId, qty)
  - OrderConfirmedEvent(orderId, totalAmount)
  - InventoryReservedEvent(productId, qty)
  
Rebuild state from events
```

### 3. CQRS (Command Query Responsibility Segregation)
```
Command Side (Write):
  └─ OrderService (with locks)
  
Query Side (Read):
  └─ OrderReadModel (eventual consistency)
  └─ Fast reads without locks
```

### 4. Message Queue
```
Async order processing:
1. Client: submitOrder() → Queue
2. Worker: Processes order confirmation
3. Client: Polls status or webhook notification
```

---

## Summary

This LLD demonstrates:
✓ Thread-safe concurrent access
✓ State machine management  
✓ Inventory consistency
✓ Proper exception handling
✓ Scalable read-write operations
✓ Interview-ready design discussions
✓ Clear path to database migration
