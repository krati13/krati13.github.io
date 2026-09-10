package com.lld.ordermgmt.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Inventory Service Tests")
class InventoryServiceTest {
    private InventoryService inventoryService;

    @BeforeEach
    void setUp() {
        inventoryService = new InventoryService();
    }

    @Test
    @DisplayName("Should add product to inventory")
    void testAddProduct() {
        inventoryService.addProduct("PROD-001", "Laptop", 10);
        var item = inventoryService.getProduct("PROD-001");

        assertNotNull(item);
        assertEquals("PROD-001", item.getProductId());
        assertEquals(10, item.getAvailableQuantity());
    }

    @Test
    @DisplayName("Should check available quantity")
    void testHasAvailableQuantity() {
        inventoryService.addProduct("PROD-001", "Laptop", 5);

        assertTrue(inventoryService.hasAvailableQuantity("PROD-001", 5));
        assertTrue(inventoryService.hasAvailableQuantity("PROD-001", 3));
        assertFalse(inventoryService.hasAvailableQuantity("PROD-001", 6));
        assertFalse(inventoryService.hasAvailableQuantity("NON-EXISTENT", 1));
    }

    @Test
    @DisplayName("Should reserve quantity successfully")
    void testReserveQuantity() {
        inventoryService.addProduct("PROD-001", "Laptop", 10);

        assertTrue(inventoryService.reserveQuantity("PROD-001", 5));
        assertEquals(5, inventoryService.getProduct("PROD-001").getAvailableQuantity());
    }

    @Test
    @DisplayName("Should fail to reserve when insufficient quantity")
    void testReserveQuantityFails() {
        inventoryService.addProduct("PROD-001", "Laptop", 5);

        assertFalse(inventoryService.reserveQuantity("PROD-001", 10));
        assertEquals(5, inventoryService.getProduct("PROD-001").getAvailableQuantity());
    }

    @Test
    @DisplayName("Should release reserved quantity")
    void testReleaseQuantity() {
        inventoryService.addProduct("PROD-001", "Laptop", 10);
        inventoryService.reserveQuantity("PROD-001", 5);

        inventoryService.releaseQuantity("PROD-001", 3);
        assertEquals(8, inventoryService.getProduct("PROD-001").getAvailableQuantity());
    }

    @Test
    @DisplayName("Should restock product")
    void testRestockProduct() {
        inventoryService.addProduct("PROD-001", "Laptop", 5);
        inventoryService.restockProduct("PROD-001", 10);

        assertEquals(15, inventoryService.getProduct("PROD-001").getAvailableQuantity());
    }

    @Test
    @DisplayName("Should return inventory status string")
    void testGetInventoryStatus() {
        inventoryService.addProduct("PROD-001", "Laptop", 5);
        String status = inventoryService.getInventoryStatus();

        assertNotNull(status);
        assertFalse(status.isEmpty());
        assertTrue(status.contains("PROD-001"));
    }
}
