package com.lld.ordermgmt.model;

/**
 * Enum representing the lifecycle states of an order.
 * Valid transitions: PENDING -> CONFIRMED -> SHIPPED -> DELIVERED
 *                   PENDING -> CANCELLED
 *                   CONFIRMED -> CANCELLED
 */
public enum OrderStatus {
    PENDING("Waiting for confirmation"),
    CONFIRMED("Order confirmed and ready for shipment"),
    SHIPPED("Order has been shipped"),
    DELIVERED("Order has been delivered"),
    CANCELLED("Order has been cancelled");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    /**
     * Validates if transition from current status to next status is allowed.
     */
    public boolean canTransitionTo(OrderStatus nextStatus) {
        return switch (this) {
            case PENDING -> nextStatus == CONFIRMED || nextStatus == CANCELLED;
            case CONFIRMED -> nextStatus == SHIPPED || nextStatus == CANCELLED;
            case SHIPPED -> nextStatus == DELIVERED;
            case DELIVERED, CANCELLED -> false;
        };
    }
}
