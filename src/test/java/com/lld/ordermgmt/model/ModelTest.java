package com.lld.ordermgmt.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Order Item Model Tests")
class OrderItemTest {
    @Test
    @DisplayName("Should create order item successfully")
    void testCreateOrderItem() {
        var item = new OrderItem("PROD-001", "Laptop", BigDecimal.valueOf(1000), 2);

        assertEquals("PROD-001", item.getProductId());
        assertEquals("Laptop", item.getProductName());
        assertEquals(BigDecimal.valueOf(1000), item.getPrice());
        assertEquals(2, item.getQuantity());
    }

    @Test
    @DisplayName("Should calculate total price correctly")
    void testCalculateTotal() {
        var item = new OrderItem("PROD-001", "Laptop", BigDecimal.valueOf(1000), 3);
        assertEquals(BigDecimal.valueOf(3000), item.getTotal());
    }

    @Test
    @DisplayName("Should throw exception for null product ID")
    void testInvalidProductId() {
        assertThrows(IllegalArgumentException.class,
                () -> new OrderItem(null, "Laptop", BigDecimal.valueOf(1000), 1));
        assertThrows(IllegalArgumentException.class,
                () -> new OrderItem("", "Laptop", BigDecimal.valueOf(1000), 1));
    }

    @Test
    @DisplayName("Should throw exception for invalid price")
    void testInvalidPrice() {
        assertThrows(IllegalArgumentException.class,
                () -> new OrderItem("PROD-001", "Laptop", BigDecimal.ZERO, 1));
        assertThrows(IllegalArgumentException.class,
                () -> new OrderItem("PROD-001", "Laptop", BigDecimal.valueOf(-100), 1));
        assertThrows(IllegalArgumentException.class,
                () -> new OrderItem("PROD-001", "Laptop", null, 1));
    }

    @Test
    @DisplayName("Should throw exception for invalid quantity")
    void testInvalidQuantity() {
        assertThrows(IllegalArgumentException.class,
                () -> new OrderItem("PROD-001", "Laptop", BigDecimal.valueOf(1000), 0));
        assertThrows(IllegalArgumentException.class,
                () -> new OrderItem("PROD-001", "Laptop", BigDecimal.valueOf(1000), -1));
    }
}

@DisplayName("Order Model Tests")
class OrderTest {
    @Test
    @DisplayName("Should create order successfully")
    void testCreateOrder() {
        var order = new Order("ORD-001", "CUST-001");

        assertEquals("ORD-001", order.getOrderId());
        assertEquals("CUST-001", order.getCustomerId());
        assertEquals(OrderStatus.PENDING, order.getStatus());
        assertTrue(order.getItems().isEmpty());
    }

    @Test
    @DisplayName("Should add item to order")
    void testAddItem() {
        var order = new Order("ORD-001", "CUST-001");
        var item = new OrderItem("PROD-001", "Laptop", BigDecimal.valueOf(1000), 1);

        order.addItem(item);

        assertEquals(1, order.getItems().size());
        assertEquals(item, order.getItems().get(0));
    }

    @Test
    @DisplayName("Should not allow adding items to non-pending order")
    void testCannotAddItemToNonPendingOrder() {
        var order = new Order("ORD-001", "CUST-001");
        var item1 = new OrderItem("PROD-001", "Laptop", BigDecimal.valueOf(1000), 1);
        order.addItem(item1);

        order.transitionStatus(OrderStatus.CONFIRMED);

        var item2 = new OrderItem("PROD-002", "Mouse", BigDecimal.valueOf(50), 1);
        assertThrows(IllegalStateException.class, () -> order.addItem(item2));
    }

    @Test
    @DisplayName("Should remove item from order")
    void testRemoveItem() {
        var order = new Order("ORD-001", "CUST-001");
        var item1 = new OrderItem("PROD-001", "Laptop", BigDecimal.valueOf(1000), 1);
        var item2 = new OrderItem("PROD-002", "Mouse", BigDecimal.valueOf(50), 1);

        order.addItem(item1);
        order.addItem(item2);

        assertTrue(order.removeItem("PROD-001"));
        assertEquals(1, order.getItems().size());
        assertEquals("PROD-002", order.getItems().get(0).getProductId());
    }

    @Test
    @DisplayName("Should return false when removing non-existent item")
    void testRemoveNonExistentItem() {
        var order = new Order("ORD-001", "CUST-001");
        var item = new OrderItem("PROD-001", "Laptop", BigDecimal.valueOf(1000), 1);
        order.addItem(item);

        assertFalse(order.removeItem("NON-EXISTENT"));
        assertEquals(1, order.getItems().size());
    }

    @Test
    @DisplayName("Should calculate correct order total")
    void testCalculateTotal() {
        var order = new Order("ORD-001", "CUST-001");
        var item1 = new OrderItem("PROD-001", "Laptop", BigDecimal.valueOf(1000), 2);
        var item2 = new OrderItem("PROD-002", "Mouse", BigDecimal.valueOf(50), 3);

        order.addItem(item1);
        order.addItem(item2);

        assertEquals(BigDecimal.valueOf(2150), order.getTotal());
    }

    @Test
    @DisplayName("Should transition status according to rules")
    void testStatusTransitions() {
        var order = new Order("ORD-001", "CUST-001");

        order.transitionStatus(OrderStatus.CONFIRMED);
        assertEquals(OrderStatus.CONFIRMED, order.getStatus());

        order.transitionStatus(OrderStatus.SHIPPED);
        assertEquals(OrderStatus.SHIPPED, order.getStatus());

        order.transitionStatus(OrderStatus.DELIVERED);
        assertEquals(OrderStatus.DELIVERED, order.getStatus());
    }

    @Test
    @DisplayName("Should throw exception for invalid status transitions")
    void testInvalidStatusTransitions() {
        var order = new Order("ORD-001", "CUST-001");

        // Cannot go directly to SHIPPED from PENDING
        assertThrows(IllegalStateException.class,
                () -> order.transitionStatus(OrderStatus.SHIPPED));

        // Cannot transition from PENDING to DELIVERED
        assertThrows(IllegalStateException.class,
                () -> order.transitionStatus(OrderStatus.DELIVERED));
    }

    @Test
    @DisplayName("Should not allow status transitions from terminal states")
    void testNoTransitionsFromTerminalStates() {
        var order = new Order("ORD-001", "CUST-001");
        order.transitionStatus(OrderStatus.CANCELLED);

        assertThrows(IllegalStateException.class,
                () -> order.transitionStatus(OrderStatus.CONFIRMED));

        var order2 = new Order("ORD-002", "CUST-001");
        order2.transitionStatus(OrderStatus.CONFIRMED);
        order2.transitionStatus(OrderStatus.SHIPPED);
        order2.transitionStatus(OrderStatus.DELIVERED);

        assertThrows(IllegalStateException.class,
                () -> order2.transitionStatus(OrderStatus.SHIPPED));
    }

    @Test
    @DisplayName("Should make order unmodifiable after confirmation")
    void testModifiabilityCheck() {
        var order = new Order("ORD-001", "CUST-001");
        assertTrue(order.isModifiable());

        order.transitionStatus(OrderStatus.CONFIRMED);
        assertFalse(order.isModifiable());
    }

    @Test
    @DisplayName("Should return unmodifiable items list")
    void testUnmodifiableItemsList() {
        var order = new Order("ORD-001", "CUST-001");
        var item = new OrderItem("PROD-001", "Laptop", BigDecimal.valueOf(1000), 1);
        order.addItem(item);

        var items = order.getItems();
        assertThrows(UnsupportedOperationException.class, () -> items.add(
                new OrderItem("PROD-002", "Mouse", BigDecimal.valueOf(50), 1)
        ));
    }
}
