package com.lld.ordermgmt.exception;

/**
 * Thrown when there is insufficient inventory to fulfill an order.
 */
public class InsufficientInventoryException extends RuntimeException {
    private final String productId;
    private final int requestedQuantity;
    private final int availableQuantity;

    public InsufficientInventoryException(String productId, int requestedQuantity, int availableQuantity) {
        super(String.format(
                "Insufficient inventory for product %s. Requested: %d, Available: %d",
                productId, requestedQuantity, availableQuantity
        ));
        this.productId = productId;
        this.requestedQuantity = requestedQuantity;
        this.availableQuantity = availableQuantity;
    }

    public String getProductId() {
        return productId;
    }

    public int getRequestedQuantity() {
        return requestedQuantity;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }
}
