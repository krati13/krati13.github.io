package com.lld.ordermgmt.service;

import com.lld.ordermgmt.model.InventoryItem;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Thread-safe inventory management service.
 * Manages product inventory and handles reservations/releases.
 */
public class InventoryService {
    private final ConcurrentHashMap<String, InventoryItem> inventory;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    public InventoryService() {
        this.inventory = new ConcurrentHashMap<>();
    }

    /**
     * Add or update product inventory.
     */
    public void addProduct(String productId, String productName, int quantity) {
        lock.writeLock().lock();
        try {
            inventory.put(productId, new InventoryItem(productId, productName, quantity));
        } finally {
            lock.writeLock().unlock();
        }
    }

    /**
     * Get inventory item for a product.
     * Returns null if product not found.
     */
    public InventoryItem getProduct(String productId) {
        lock.readLock().lock();
        try {
            return inventory.get(productId);
        } finally {
            lock.readLock().unlock();
        }
    }

    /**
     * Check if sufficient quantity is available.
     */
    public boolean hasAvailableQuantity(String productId, int requiredQuantity) {
        lock.readLock().lock();
        try {
            InventoryItem item = inventory.get(productId);
            return item != null && item.hasAvailableQuantity(requiredQuantity);
        } finally {
            lock.readLock().unlock();
        }
    }

    /**
     * Reserve quantity for an order.
     * Returns true if reservation successful, false if insufficient stock.
     */
    public boolean reserveQuantity(String productId, int quantity) {
        lock.writeLock().lock();
        try {
            InventoryItem item = inventory.get(productId);
            if (item == null) {
                return false;
            }
            return item.reserve(quantity);
        } finally {
            lock.writeLock().unlock();
        }
    }

    /**
     * Release reserved quantity back to inventory.
     */
    public void releaseQuantity(String productId, int quantity) {
        lock.writeLock().lock();
        try {
            InventoryItem item = inventory.get(productId);
            if (item != null) {
                item.release(quantity);
            }
        } finally {
            lock.writeLock().unlock();
        }
    }

    /**
     * Restock a product.
     */
    public void restockProduct(String productId, int quantity) {
        lock.writeLock().lock();
        try {
            InventoryItem item = inventory.get(productId);
            if (item != null) {
                item.restock(quantity);
            }
        } finally {
            lock.writeLock().unlock();
        }
    }

    /**
     * Get current inventory state (for display purposes).
     */
    public String getInventoryStatus() {
        lock.readLock().lock();
        try {
            return inventory.values().stream()
                    .map(Object::toString)
                    .reduce((a, b) -> a + "\n" + b)
                    .orElse("Inventory is empty");
        } finally {
            lock.readLock().unlock();
        }
    }
}
