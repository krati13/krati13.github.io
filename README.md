# Thread-Safe In-Memory Order Management System - LLD Interview Project

## Overview
This is a comprehensive **Low-Level Design (LLD)** system for managing orders in a multi-threaded environment using **Core Java 21** only. It demonstrates key LLD concepts including thread safety, state management, inventory handling, and system design patterns.

## Project Structure

```
src/
├── main/java/com/lld/ordermgmt/
│   ├── model/
│   │   ├── Order.java          # Core order entity
│   │   ├── OrderItem.java      # Individual order line item
│   │   ├── OrderStatus.java    # Order state machine
│   │   └── InventoryItem.java  # Inventory tracking
│   ├── service/
│   │   ├── OrderService.java      # Thread-safe order management
│   │   └── InventoryService.java  # Thread-safe inventory management
│   └── exception/
│       ├── OrderNotFoundException.java
│       ├── InsufficientInventoryException.java
│       └── InvalidOrderStateException.java
└── test/java/com/lld/ordermgmt/
    ├── service/
    │   ├── OrderServiceTest.java         # Core functionality tests
    │   ├── OrderServiceThreadSafetyTest.java # Concurrency tests
    │   └── InventoryServiceTest.java
    └── model/
        └── ModelTest.java                # Order/OrderItem model tests
```

## Core Features

### 1. **Order Management**
- Create orders for customers
- Add/remove items from orders
- Calculate total order amount
- Retrieve order details
- Cancel orders with inventory release

### 2. **Order State Machine**
```
PENDING → CONFIRMED → SHIPPED → DELIVERED
   ↓                      ↑
   └──→ CANCELLED ←───────┘
```

**Valid Transitions:**
- PENDING → CONFIRMED (after inventory validation)
- PENDING → CANCELLED
- CONFIRMED → SHIPPED
- CONFIRMED → CANCELLED
- SHIPPED → DELIVERED

### 3. **Inventory Management**
- Track product quantities
- Reserve inventory on order confirmation
- Release inventory on order cancellation
- Validate availability before confirming

### 4. **Thread Safety**
- **ConcurrentHashMap** for thread-safe order storage
- **ReentrantReadWriteLock** for order-level synchronization
- Write locks for state changes
- Read locks for read operations
- Atomic inventory operations

## Key Design Patterns

### 1. **State Pattern** (OrderStatus)
```java
public boolean canTransitionTo(OrderStatus nextStatus) {
    return switch (this) {
        case PENDING -> nextStatus == CONFIRMED || nextStatus == CANCELLED;
        case CONFIRMED -> nextStatus == SHIPPED || nextStatus == CANCELLED;
        case SHIPPED -> nextStatus == DELIVERED;
        case DELIVERED, CANCELLED -> false;
    };
}
```

### 2. **Service Layer Pattern**
- OrderService: Thread-safe order operations
- InventoryService: Concurrent inventory management

### 3. **Custom Exception Handling**
- OrderNotFoundException
- InsufficientInventoryException
- InvalidOrderStateException

### 4. **Immutability & Defensive Copying**
- Unmodifiable items lists
- Defensive copies returned from services

## Thread Safety Mechanisms

### Order-Level Locking
```java
private final ConcurrentHashMap<String, ReadWriteLock> orderLocks;

public void confirmOrder(String orderId) {
    lock.writeLock().lock();
    try {
        // Atomic state transition + inventory reservation
    } finally {
        lock.writeLock().unlock();
    }
}
```

### Read-Write Lock Strategy
- Multiple concurrent readers for read operations
- Exclusive write lock for state changes
- Prevents race conditions in state transitions

### Inventory Thread Safety
- Global ReadWriteLock for inventory access
- Atomic reserve operations
- Rollback on partial failures

## Design Issues (Interview Discussion)

### Issue 1: Race Condition in Multi-Item Confirmation
When confirming an order:
1. Check inventory for all items
2. **RACE CONDITION HERE** - Another thread reserves items
3. Try to reserve - may fail

**Solution**: Write lock holds entire confirmation atomic

### Issue 2: Deadlock Potential
Future operations locking multiple orders:
```
Thread 1: Order A → Order B lock sequence
Thread 2: Order B → Order A lock sequence
DEADLOCK!
```

**Prevention**: Acquire locks in consistent order (by Order ID)

### Issue 3: Inventory Validation Overhead
Checking availability twice (hasAvailableQuantity + reserve) is inefficient

**Better**: Atomic reserve-with-check operation

### Issue 4: Order Item Immutability
Items list protected as unmodifiable, but timing of when it becomes unmodifiable matters

## Test Coverage

### Functional Tests (OrderServiceTest - 12 tests)
- ✓ Order CRUD operations
- ✓ Item addition/removal
- ✓ State transitions
- ✓ Inventory validation
- ✓ Cancellation with inventory release
- ✓ Invalid state transition handling

### Thread Safety Tests (OrderServiceThreadSafetyTest - 6 tests)
- ✓ Concurrent order creation (10 threads)
- ✓ Concurrent item additions to same order
- ✓ Prevention of duplicate confirmations
- ✓ Concurrent read/write inventory operations
- ✓ Inventory depletion under high load
- ✓ Data consistency under stress (500+ operations)

### Model Tests (ModelTest - 13 tests)
- ✓ Order and OrderItem validation
- ✓ State machine transitions
- ✓ Total calculation
- ✓ Immutability checks
- ✓ Exception handling

**Total: 31 JUnit 5 Tests**

## Building & Testing

```bash
# Compile project
mvn clean compile

# Run all tests
mvn clean test

# Run specific test class
mvn test -Dtest=OrderServiceThreadSafetyTest

# Generate coverage report
mvn clean test jacoco:report
```

## Code Statistics

| Category | Lines | Classes |
|----------|-------|---------|
| Models | 400 | 4 |
| Services | 380 | 2 |
| Exceptions | 100 | 3 |
| Tests | 900 | 5 |
| **Total** | **1780** | **14** |

## Interview Question: Database Migration

### Question
**"If this moved from in-memory to PostgreSQL/MySQL, how would you handle transactions, concurrent updates, consistency, and locking?"**

### Answer Framework

#### 1. **ACID Transactions**
```sql
BEGIN TRANSACTION;
    SELECT quantity FROM inventory WHERE product_id = ? FOR UPDATE;
    UPDATE inventory SET quantity = quantity - ? WHERE product_id = ?;
    INSERT INTO orders (order_id, status) VALUES (?, ?);
    INSERT INTO order_items (...) VALUES (...);
COMMIT;
```

#### 2. **Isolation Levels**
- **REPEATABLE_READ**: Default - prevents dirty reads
- **SERIALIZABLE**: Maximum consistency (at cost of throughput)

#### 3. **Locking Strategies**

**Pessimistic Locking (SELECT FOR UPDATE):**
- Pros: Simple, prevents conflicts
- Cons: Serializes access, deadlock risk

**Optimistic Locking (Version Column):**
```java
UPDATE inventory SET quantity = ?, version = version + 1
WHERE product_id = ? AND version = ?;
```
- Pros: Better concurrency, no deadlocks
- Cons: Retry logic needed

**Hybrid Approach:**
- Optimistic for reads, pessimistic on conflicts

#### 4. **Consistency Patterns**
- **Saga Pattern**: Distributed transactions with compensation
- **Idempotency Keys**: Prevent duplicate operations on retries
- **Audit Logs**: Track all state transitions

#### 5. **Concurrent Update Handling**
- Atomic read-modify-write operations
- Version/timestamp-based conflict detection
- Retry logic with exponential backoff

#### 6. **Deadlock Prevention**
- Consistent lock ordering
- Lock wait timeouts
- Monitoring and alerting

#### 7. **Performance**
- Index on order_id, customer_id, status, product_id
- Partition large tables by customer_id
- Caching layer (Redis) for inventory

#### 8. **Distributed Tracing**
```java
String txnId = UUID.randomUUID().toString();
MDC.put("txn_id", txnId);
// All logs include transaction ID
```

## Key Takeaways

1. **Thread Safety in Memory**: Understanding locks is crucial
2. **Database Transactions**: Different challenges when data is persistent
3. **Trade-offs**: Throughput vs. consistency vs. complexity
4. **Testing Concurrency**: Hard to test; need stress tests
5. **Production Concerns**: Monitoring, debugging, failure modes

## Files Overview

| File | Purpose | Lines |
|------|---------|-------|
| OrderStatus.java | State machine | 50 |
| Order.java | Order entity | 140 |
| OrderItem.java | Line item | 80 |
| InventoryItem.java | Inventory tracking | 90 |
| OrderService.java | Order operations | 250 |
| InventoryService.java | Inventory ops | 130 |
| OrderServiceTest.java | Functional tests | 300 |
| OrderServiceThreadSafetyTest.java | Concurrency tests | 350 |
| ModelTest.java | Unit tests | 250 |

## Extensions

- Distributed locks (Redis)
- Event sourcing
- CQRS pattern
- Message queues (Kafka/RabbitMQ)
- Payment integration
- Order splitting/partial fulfillment
- Customer notifications
- Audit logging

---

**Language**: Java 21
**Dependencies**: JUnit 5 only
**Build Tool**: Maven
**Thread Model**: Multi-threaded with explicit locking
