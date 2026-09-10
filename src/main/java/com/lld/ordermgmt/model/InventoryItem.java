package com.lld.ordermgmt.model;

import java.util.Objects;

/**
 * Represents an inventory item tracking available stock for a product.
 */
public class InventoryItem {
    private final String productId;
    private final String productName;
    private int availableQuantity;

    public InventoryItem(String productId, String productName, int availableQuantity) {
        if (productId == null || productId.isBlank()) {
            throw new IllegalArgumentException("Product ID cannot be null or empty");
        }
        if (productName == null || productName.isBlank()) {
            throw new IllegalArgumentException("Product name cannot be null or empty");
        }
        if (availableQuantity < 0) {
            throw new IllegalArgumentException("Available quantity cannot be negative");
        }

        this.productId = productId;
        this.productName = productName;
        this.availableQuantity = availableQuantity;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    /**
     * Check if sufficient quantity is available.
     */
    public boolean hasAvailableQuantity(int requiredQuantity) {
        return availableQuantity >= requiredQuantity;
    }

    /**
     * Reserve quantity from inventory.
     * Returns true if reservation was successful, false if insufficient stock.
     */
    public boolean reserve(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        if (availableQuantity >= quantity) {
            availableQuantity -= quantity;
            return true;
        }
        return false;
    }

    /**
     * Release reserved quantity back to inventory.
     */
    public void release(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        availableQuantity += quantity;
    }

    /**
     * Restock inventory.
     */
    public void restock(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity to restock must be greater than zero");
        }
        availableQuantity += quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InventoryItem that = (InventoryItem) o;
        return Objects.equals(productId, that.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }

    @Override
    public String toString() {
        return "InventoryItem{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", availableQuantity=" + availableQuantity +
                '}';
    }
}
