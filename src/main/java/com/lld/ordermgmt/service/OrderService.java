package com.lld.ordermgmt.service;

import com.lld.ordermgmt.model.Order;
import com.lld.ordermgmt.model.OrderItem;
import com.lld.ordermgmt.model.OrderStatus;
import com.lld.ordermgmt.exception.InsufficientInventoryException;
import com.lld.ordermgmt.exception.OrderNotFoundException;
import com.lld.ordermgmt.exception.InvalidOrderStateException;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Thread-safe order management service.
 * Handles order creation, updates, state transitions, and cancellation.
 * 
 * Thread Safety Design:
 * - Uses ReentrantReadWriteLock for order-level locking
 * - ConcurrentHashMap for thread-safe order storage
 * - Individual order locks for isolation during concurrent updates
 * 
 * Design Issue Introduced (for interview discussion):
 * - DeadLock potential: If confirmOrder() is called while another thread is splitting the order
 * - Race condition: Two threads confirming the same order simultaneously
 * - Solution: Order-level locking prevents this, but introduces complexity
 */
public class OrderService {
    private final ConcurrentHashMap<String, Order> orders;
    private final ConcurrentHashMap<String, ReadWriteLock> orderLocks;
    private final InventoryService inventoryService;

    public OrderService(InventoryService inventoryService) {
        this.orders = new ConcurrentHashMap<>();
        this.orderLocks = new ConcurrentHashMap<>();
        this.inventoryService = inventoryService;
    }

    /**
     * Create a new order for a customer.
     */
    public Order createOrder(String orderId, String customerId) {
        Order order = new Order(orderId, customerId);
        orders.put(orderId, order);
        orderLocks.put(orderId, new ReentrantReadWriteLock());
        return order;
    }

    /**
     * Retrieve an order by ID.
     */
    public Order getOrder(String orderId) {
        Order order = orders.get(orderId);
        if (order == null) {
            throw new OrderNotFoundException("Order not found: " + orderId);
        }
        return order;
    }

    /**
     * Add an item to an order.
     * Thread-safe: acquires write lock on the order.
     */
    public void addItemToOrder(String orderId, OrderItem item) {
        Order order = getOrder(orderId);
        ReadWriteLock lock = orderLocks.get(orderId);
        
        lock.writeLock().lock();
        try {
            order.addItem(item);
        } finally {
            lock.writeLock().unlock();
        }
    }

    /**
     * Remove an item from an order.
     * Thread-safe: acquires write lock on the order.
     */
    public void removeItemFromOrder(String orderId, String productId) {
        Order order = getOrder(orderId);
        ReadWriteLock lock = orderLocks.get(orderId);
        
        lock.writeLock().lock();
        try {
            order.removeItem(productId);
        } finally {
            lock.writeLock().unlock();
        }
    }

    /**
     * Get a copy of order items.
     * Thread-safe: acquires read lock on the order.
     */
    public List<OrderItem> getOrderItems(String orderId) {
        Order order = getOrder(orderId);
        ReadWriteLock lock = orderLocks.get(orderId);
        
        lock.readLock().lock();
        try {
            return new ArrayList<>(order.getItems());
        } finally {
            lock.readLock().unlock();
        }
    }

    /**
     * Confirm an order after validating inventory.
     * Reserves items from inventory.
     * Thread-safe: acquires write lock and validates state transition.
     * 
     * Throws InsufficientInventoryException if items are unavailable.
     */
    public void confirmOrder(String orderId) {
        Order order = getOrder(orderId);
        ReadWriteLock lock = orderLocks.get(orderId);
        
        lock.writeLock().lock();
        try {
            // Validate state transition
            if (!order.getStatus().canTransitionTo(OrderStatus.CONFIRMED)) {
                throw new InvalidOrderStateException(order.getStatus(), OrderStatus.CONFIRMED);
            }

            // Validate inventory availability for all items
            for (OrderItem item : order.getItems()) {
                if (!inventoryService.hasAvailableQuantity(
                        item.getProductId(), item.getQuantity())) {
                    throw new InsufficientInventoryException(
                            item.getProductId(),
                            item.getQuantity(),
                            inventoryService.getProduct(item.getProductId()) != null ?
                                    inventoryService.getProduct(item.getProductId()).getAvailableQuantity() : 0
                    );
                }
            }

            // Reserve all items in inventory
            for (OrderItem item : order.getItems()) {
                boolean reserved = inventoryService.reserveQuantity(item.getProductId(), item.getQuantity());
                if (!reserved) {
                    // Rollback: release already reserved items
                    for (OrderItem rollbackItem : order.getItems()) {
                        if (!rollbackItem.equals(item)) {
                            inventoryService.releaseQuantity(rollbackItem.getProductId(), rollbackItem.getQuantity());
                        }
                    }
                    throw new InsufficientInventoryException(
                            item.getProductId(),
                            item.getQuantity(),
                            0
                    );
                }
            }

            // Transition order status
            order.transitionStatus(OrderStatus.CONFIRMED);
        } finally {
            lock.writeLock().unlock();
        }
    }

    /**
     * Ship an order.
     * Thread-safe: acquires write lock and validates state transition.
     */
    public void shipOrder(String orderId) {
        Order order = getOrder(orderId);
        ReadWriteLock lock = orderLocks.get(orderId);
        
        lock.writeLock().lock();
        try {
            if (!order.getStatus().canTransitionTo(OrderStatus.SHIPPED)) {
                throw new InvalidOrderStateException(order.getStatus(), OrderStatus.SHIPPED);
            }
            order.transitionStatus(OrderStatus.SHIPPED);
        } finally {
            lock.writeLock().unlock();
        }
    }

    /**
     * Deliver an order.
     * Thread-safe: acquires write lock and validates state transition.
     */
    public void deliverOrder(String orderId) {
        Order order = getOrder(orderId);
        ReadWriteLock lock = orderLocks.get(orderId);
        
        lock.writeLock().lock();
        try {
            if (!order.getStatus().canTransitionTo(OrderStatus.DELIVERED)) {
                throw new InvalidOrderStateException(order.getStatus(), OrderStatus.DELIVERED);
            }
            order.transitionStatus(OrderStatus.DELIVERED);
        } finally {
            lock.writeLock().unlock();
        }
    }

    /**
     * Cancel an order and release reserved inventory.
     * Thread-safe: acquires write lock and validates state transition.
     */
    public void cancelOrder(String orderId) {
        Order order = getOrder(orderId);
        ReadWriteLock lock = orderLocks.get(orderId);
        
        lock.writeLock().lock();
        try {
            if (!order.getStatus().canTransitionTo(OrderStatus.CANCELLED)) {
                throw new InvalidOrderStateException(order.getStatus(), OrderStatus.CANCELLED);
            }

            // Release items back to inventory (only if order was confirmed)
            if (order.getStatus() == OrderStatus.CONFIRMED ||
                    order.getStatus() == OrderStatus.SHIPPED) {
                for (OrderItem item : order.getItems()) {
                    inventoryService.releaseQuantity(item.getProductId(), item.getQuantity());
                }
            }

            order.transitionStatus(OrderStatus.CANCELLED);
        } finally {
            lock.writeLock().unlock();
        }
    }

    /**
     * Get order status.
     * Thread-safe: acquires read lock.
     */
    public OrderStatus getOrderStatus(String orderId) {
        Order order = getOrder(orderId);
        ReadWriteLock lock = orderLocks.get(orderId);
        
        lock.readLock().lock();
        try {
            return order.getStatus();
        } finally {
            lock.readLock().unlock();
        }
    }

    /**
     * Get total amount for an order.
     * Thread-safe: acquires read lock.
     */
    public Object getOrderTotal(String orderId) {
        Order order = getOrder(orderId);
        ReadWriteLock lock = orderLocks.get(orderId);
        
        lock.readLock().lock();
        try {
            return order.getTotal();
        } finally {
            lock.readLock().unlock();
        }
    }

    /**
     * Get all orders (for testing/reporting).
     */
    public Collection<Order> getAllOrders() {
        return new ArrayList<>(orders.values());
    }
}
