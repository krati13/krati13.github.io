package com.lld.ordermgmt.exception;

import com.lld.ordermgmt.model.OrderStatus;

/**
 * Thrown when an invalid order state transition is attempted.
 */
public class InvalidOrderStateException extends RuntimeException {
    private final OrderStatus currentStatus;
    private final OrderStatus attemptedStatus;

    public InvalidOrderStateException(OrderStatus currentStatus, OrderStatus attemptedStatus) {
        super(String.format(
                "Cannot transition from %s to %s",
                currentStatus, attemptedStatus
        ));
        this.currentStatus = currentStatus;
        this.attemptedStatus = attemptedStatus;
    }

    public OrderStatus getCurrentStatus() {
        return currentStatus;
    }

    public OrderStatus getAttemptedStatus() {
        return attemptedStatus;
    }
}
