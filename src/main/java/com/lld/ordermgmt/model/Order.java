package com.lld.ordermgmt.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

/**
 * Represents an order containing multiple items.
 * This class is NOT thread-safe by itself; thread safety is managed by OrderService.
 */
public class Order {
    private final String orderId;
    private final String customerId;
    private OrderStatus status;
    private final List<OrderItem> items;
    private final LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;

    public Order(String orderId, String customerId) {
        if (orderId == null || orderId.isBlank()) {
            throw new IllegalArgumentException("Order ID cannot be null or empty");
        }
        if (customerId == null || customerId.isBlank()) {
            throw new IllegalArgumentException("Customer ID cannot be null or empty");
        }

        this.orderId = orderId;
        this.customerId = customerId;
        this.status = OrderStatus.PENDING;
        this.items = new ArrayList<>();
        this.createdAt = LocalDateTime.now();
        this.lastModifiedAt = LocalDateTime.now();
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getLastModifiedAt() {
        return lastModifiedAt;
    }

    /**
     * Get an unmodifiable copy of the items list to prevent external modification.
     */
    public List<OrderItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    /**
     * Add an item to the order.
     * Only allowed when order is in PENDING state.
     */
    public void addItem(OrderItem item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }
        if (status != OrderStatus.PENDING) {
            throw new IllegalStateException("Cannot add items to order in " + status + " state");
        }
        items.add(item);
        lastModifiedAt = LocalDateTime.now();
    }

    /**
     * Remove an item from the order by product ID.
     * Only allowed when order is in PENDING state.
     * Returns true if item was removed, false if not found.
     */
    public boolean removeItem(String productId) {
        if (productId == null || productId.isBlank()) {
            throw new IllegalArgumentException("Product ID cannot be null or empty");
        }
        if (status != OrderStatus.PENDING) {
            throw new IllegalStateException("Cannot remove items from order in " + status + " state");
        }
        boolean removed = items.removeIf(item -> item.getProductId().equals(productId));
        if (removed) {
            lastModifiedAt = LocalDateTime.now();
        }
        return removed;
    }

    /**
     * Calculate total order amount.
     */
    public BigDecimal getTotal() {
        return items.stream()
                .map(OrderItem::getTotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    /**
     * Transition the order to a new status.
     * Validates state transition rules.
     */
    public void transitionStatus(OrderStatus newStatus) {
        if (newStatus == null) {
            throw new IllegalArgumentException("New status cannot be null");
        }
        if (!status.canTransitionTo(newStatus)) {
            throw new IllegalStateException(
                    "Cannot transition from " + status + " to " + newStatus
            );
        }
        status = newStatus;
        lastModifiedAt = LocalDateTime.now();
    }

    /**
     * Check if order can be modified (only in PENDING state).
     */
    public boolean isModifiable() {
        return status == OrderStatus.PENDING;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", status=" + status +
                ", itemCount=" + items.size() +
                ", total=" + getTotal() +
                ", createdAt=" + createdAt +
                ", lastModifiedAt=" + lastModifiedAt +
                '}';
    }
}
