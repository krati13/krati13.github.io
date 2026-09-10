package com.lld.ordermgmt.service;

import com.lld.ordermgmt.model.OrderItem;
import com.lld.ordermgmt.model.OrderStatus;
import com.lld.ordermgmt.exception.InsufficientInventoryException;
import com.lld.ordermgmt.exception.InvalidOrderStateException;
import com.lld.ordermgmt.exception.OrderNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Order Management Service Tests")
class OrderServiceTest {
    private OrderService orderService;
    private InventoryService inventoryService;

    @BeforeEach
    void setUp() {
        inventoryService = new InventoryService();
        orderService = new OrderService(inventoryService);

        // Setup inventory
        inventoryService.addProduct("PROD-001", "Laptop", 5);
        inventoryService.addProduct("PROD-002", "Mouse", 50);
        inventoryService.addProduct("PROD-003", "Keyboard", 30);
    }

    @Test
    @DisplayName("Should create order successfully")
    void testCreateOrder() {
        var order = orderService.createOrder("ORD-001", "CUST-001");
        assertNotNull(order);
        assertEquals("ORD-001", order.getOrderId());
        assertEquals("CUST-001", order.getCustomerId());
        assertEquals(OrderStatus.PENDING, order.getStatus());
    }

    @Test
    @DisplayName("Should throw exception for invalid order ID")
    void testCreateOrderWithInvalidId() {
        assertThrows(IllegalArgumentException.class,
                () -> orderService.createOrder("", "CUST-001"));
        assertThrows(IllegalArgumentException.class,
                () -> orderService.createOrder(null, "CUST-001"));
    }

    @Test
    @DisplayName("Should retrieve existing order")
    void testGetOrder() {
        orderService.createOrder("ORD-001", "CUST-001");
        var order = orderService.getOrder("ORD-001");
        assertEquals("ORD-001", order.getOrderId());
    }

    @Test
    @DisplayName("Should throw OrderNotFoundException for non-existent order")
    void testGetNonExistentOrder() {
        assertThrows(OrderNotFoundException.class,
                () -> orderService.getOrder("NON-EXISTENT"));
    }

    @Test
    @DisplayName("Should add item to pending order")
    void testAddItemToOrder() {
        orderService.createOrder("ORD-001", "CUST-001");
        var item = new OrderItem("PROD-001", "Laptop", BigDecimal.valueOf(1000), 2);

        orderService.addItemToOrder("ORD-001", item);

        var items = orderService.getOrderItems("ORD-001");
        assertEquals(1, items.size());
        assertEquals("PROD-001", items.get(0).getProductId());
    }

    @Test
    @DisplayName("Should not allow adding items to confirmed order")
    void testCannotAddItemToConfirmedOrder() {
        var order = orderService.createOrder("ORD-001", "CUST-001");
        var item = new OrderItem("PROD-001", "Laptop", BigDecimal.valueOf(1000), 2);
        orderService.addItemToOrder("ORD-001", item);

        orderService.confirmOrder("ORD-001");

        var newItem = new OrderItem("PROD-002", "Mouse", BigDecimal.valueOf(50), 5);
        assertThrows(IllegalStateException.class,
                () -> orderService.addItemToOrder("ORD-001", newItem));
    }

    @Test
    @DisplayName("Should remove item from pending order")
    void testRemoveItemFromOrder() {
        orderService.createOrder("ORD-001", "CUST-001");
        var item1 = new OrderItem("PROD-001", "Laptop", BigDecimal.valueOf(1000), 2);
        var item2 = new OrderItem("PROD-002", "Mouse", BigDecimal.valueOf(50), 5);

        orderService.addItemToOrder("ORD-001", item1);
        orderService.addItemToOrder("ORD-001", item2);

        orderService.removeItemFromOrder("ORD-001", "PROD-001");

        var items = orderService.getOrderItems("ORD-001");
        assertEquals(1, items.size());
        assertEquals("PROD-002", items.get(0).getProductId());
    }

    @Test
    @DisplayName("Should calculate correct order total")
    void testCalculateOrderTotal() {
        orderService.createOrder("ORD-001", "CUST-001");
        var item1 = new OrderItem("PROD-001", "Laptop", BigDecimal.valueOf(1000), 2);
        var item2 = new OrderItem("PROD-002", "Mouse", BigDecimal.valueOf(50), 5);

        orderService.addItemToOrder("ORD-001", item1);
        orderService.addItemToOrder("ORD-001", item2);

        var total = orderService.getOrderTotal("ORD-001");
        assertEquals(BigDecimal.valueOf(2250), total);
    }

    @Test
    @DisplayName("Should confirm order and reserve inventory")
    void testConfirmOrder() {
        orderService.createOrder("ORD-001", "CUST-001");
        var item = new OrderItem("PROD-001", "Laptop", BigDecimal.valueOf(1000), 2);
        orderService.addItemToOrder("ORD-001", item);

        orderService.confirmOrder("ORD-001");

        assertEquals(OrderStatus.CONFIRMED, orderService.getOrderStatus("ORD-001"));
        assertEquals(3, inventoryService.getProduct("PROD-001").getAvailableQuantity());
    }

    @Test
    @DisplayName("Should throw exception when confirming order with insufficient inventory")
    void testConfirmOrderWithInsufficientInventory() {
        orderService.createOrder("ORD-001", "CUST-001");
        var item = new OrderItem("PROD-001", "Laptop", BigDecimal.valueOf(1000), 10);
        orderService.addItemToOrder("ORD-001", item);

        assertThrows(InsufficientInventoryException.class,
                () -> orderService.confirmOrder("ORD-001"));
    }

    @Test
    @DisplayName("Should validate order state transitions")
    void testInvalidStateTransitions() {
        var order = orderService.createOrder("ORD-001", "CUST-001");

        // Cannot ship from PENDING
        assertThrows(InvalidOrderStateException.class,
                () -> orderService.shipOrder("ORD-001"));

        // Cannot deliver before shipped
        var item = new OrderItem("PROD-001", "Laptop", BigDecimal.valueOf(1000), 1);
        orderService.addItemToOrder("ORD-001", item);
        orderService.confirmOrder("ORD-001");

        assertThrows(InvalidOrderStateException.class,
                () -> orderService.deliverOrder("ORD-001"));
    }

    @Test
    @DisplayName("Should follow correct order state transitions")
    void testCorrectStateTransitions() {
        orderService.createOrder("ORD-001", "CUST-001");
        var item = new OrderItem("PROD-001", "Laptop", BigDecimal.valueOf(1000), 1);
        orderService.addItemToOrder("ORD-001", item);

        orderService.confirmOrder("ORD-001");
        assertEquals(OrderStatus.CONFIRMED, orderService.getOrderStatus("ORD-001"));

        orderService.shipOrder("ORD-001");
        assertEquals(OrderStatus.SHIPPED, orderService.getOrderStatus("ORD-001"));

        orderService.deliverOrder("ORD-001");
        assertEquals(OrderStatus.DELIVERED, orderService.getOrderStatus("ORD-001"));
    }

    @Test
    @DisplayName("Should cancel pending order")
    void testCancelPendingOrder() {
        orderService.createOrder("ORD-001", "CUST-001");
        orderService.cancelOrder("ORD-001");

        assertEquals(OrderStatus.CANCELLED, orderService.getOrderStatus("ORD-001"));
    }

    @Test
    @DisplayName("Should release inventory when cancelling confirmed order")
    void testCancelConfirmedOrderReleasesInventory() {
        orderService.createOrder("ORD-001", "CUST-001");
        var item = new OrderItem("PROD-001", "Laptop", BigDecimal.valueOf(1000), 3);
        orderService.addItemToOrder("ORD-001", item);

        int inventoryBefore = inventoryService.getProduct("PROD-001").getAvailableQuantity();
        orderService.confirmOrder("ORD-001");
        int inventoryAfterConfirm = inventoryService.getProduct("PROD-001").getAvailableQuantity();

        assertEquals(inventoryBefore - 3, inventoryAfterConfirm);

        orderService.cancelOrder("ORD-001");
        int inventoryAfterCancel = inventoryService.getProduct("PROD-001").getAvailableQuantity();

        assertEquals(inventoryBefore, inventoryAfterCancel);
    }

    @Test
    @DisplayName("Should not allow cancelling delivered order")
    void testCannotCancelDeliveredOrder() {
        orderService.createOrder("ORD-001", "CUST-001");
        var item = new OrderItem("PROD-001", "Laptop", BigDecimal.valueOf(1000), 1);
        orderService.addItemToOrder("ORD-001", item);

        orderService.confirmOrder("ORD-001");
        orderService.shipOrder("ORD-001");
        orderService.deliverOrder("ORD-001");

        assertThrows(InvalidOrderStateException.class,
                () -> orderService.cancelOrder("ORD-001"));
    }
}
