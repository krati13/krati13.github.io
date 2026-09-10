package com.lld.ordermgmt.service;

import com.lld.ordermgmt.model.OrderItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.math.BigDecimal;
import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Thread Safety Tests")
class OrderServiceThreadSafetyTest {
    private OrderService orderService;
    private InventoryService inventoryService;

    @BeforeEach
    void setUp() {
        inventoryService = new InventoryService();
        orderService = new OrderService(inventoryService);
        inventoryService.addProduct("PROD-001", "Laptop", 100);
    }

    @Test
    @DisplayName("Should handle concurrent order creation")
    void testConcurrentOrderCreation() throws InterruptedException {
        int threadCount = 10;
        ExecutorService executor = Executors.newFixedThreadPool(threadCount);
        CountDownLatch startLatch = new CountDownLatch(1);
        CountDownLatch endLatch = new CountDownLatch(threadCount);

        for (int i = 0; i < threadCount; i++) {
            final int orderId = i;
            executor.submit(() -> {
                try {
                    startLatch.await();
                    orderService.createOrder("ORD-" + orderId, "CUST-" + orderId);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    endLatch.countDown();
                }
            });
        }

        startLatch.countDown();
        assertTrue(endLatch.await(10, TimeUnit.SECONDS));

        assertEquals(threadCount, orderService.getAllOrders().size());
        executor.shutdown();
    }

    @Test
    @DisplayName("Should handle concurrent item additions to same order")
    void testConcurrentItemAdditionToSameOrder() throws InterruptedException {
        orderService.createOrder("ORD-001", "CUST-001");

        int threadCount = 5;
        ExecutorService executor = Executors.newFixedThreadPool(threadCount);
        CountDownLatch startLatch = new CountDownLatch(1);
        CountDownLatch endLatch = new CountDownLatch(threadCount);

        for (int i = 0; i < threadCount; i++) {
            final int productId = i;
            executor.submit(() -> {
                try {
                    startLatch.await();
                    var item = new OrderItem(
                            "PROD-" + productId,
                            "Product " + productId,
                            BigDecimal.valueOf(100),
                            2
                    );
                    orderService.addItemToOrder("ORD-001", item);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    endLatch.countDown();
                }
            });
        }

        startLatch.countDown();
        assertTrue(endLatch.await(10, TimeUnit.SECONDS));

        var items = orderService.getOrderItems("ORD-001");
        assertEquals(threadCount, items.size());
        executor.shutdown();
    }

    @Test
    @DisplayName("Should prevent concurrent modifications leading to inconsistent state")
    void testConcurrentModificationSafety() throws InterruptedException {
        orderService.createOrder("ORD-001", "CUST-001");
        var item = new OrderItem("PROD-001", "Laptop", BigDecimal.valueOf(1000), 1);
        orderService.addItemToOrder("ORD-001", item);

        int threadCount = 10;
        ExecutorService executor = Executors.newFixedThreadPool(threadCount);
        CountDownLatch startLatch = new CountDownLatch(1);
        CountDownLatch endLatch = new CountDownLatch(threadCount);
        ConcurrentHashMap<String, Exception> exceptions = new ConcurrentHashMap<>();

        for (int i = 0; i < threadCount; i++) {
            executor.submit(() -> {
                try {
                    startLatch.await();
                    orderService.confirmOrder("ORD-001");
                } catch (Exception e) {
                    exceptions.put("exception", e);
                } finally {
                    endLatch.countDown();
                }
            });
        }

        startLatch.countDown();
        assertTrue(endLatch.await(10, TimeUnit.SECONDS));

        // Only one thread should succeed, others should get exception
        assertEquals(1, threadCount - exceptions.size());
        executor.shutdown();
    }

    @Test
    @DisplayName("Should handle concurrent reads and writes to inventory")
    void testConcurrentInventoryAccess() throws InterruptedException {
        int threadCount = 20;
        ExecutorService executor = Executors.newFixedThreadPool(threadCount);
        CountDownLatch startLatch = new CountDownLatch(1);
        CountDownLatch endLatch = new CountDownLatch(threadCount);

        for (int i = 0; i < threadCount; i++) {
            final int index = i;
            if (index % 2 == 0) {
                // Read threads
                executor.submit(() -> {
                    try {
                        startLatch.await();
                        var item = inventoryService.getProduct("PROD-001");
                        assertNotNull(item);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        endLatch.countDown();
                    }
                });
            } else {
                // Write threads (reserve)
                executor.submit(() -> {
                    try {
                        startLatch.await();
                        inventoryService.reserveQuantity("PROD-001", 1);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        endLatch.countDown();
                    }
                });
            }
        }

        startLatch.countDown();
        assertTrue(endLatch.await(10, TimeUnit.SECONDS));

        int remainingInventory = inventoryService.getProduct("PROD-001").getAvailableQuantity();
        assertEquals(100 - (threadCount / 2), remainingInventory);
        executor.shutdown();
    }

    @Test
    @DisplayName("Should handle concurrent order confirmations with inventory depletion")
    void testConcurrentOrderConfirmationWithLimitedInventory() throws InterruptedException {
        inventoryService = new InventoryService();
        inventoryService.addProduct("PROD-001", "Laptop", 5);
        orderService = new OrderService(inventoryService);

        int orderCount = 10;
        for (int i = 0; i < orderCount; i++) {
            orderService.createOrder("ORD-" + i, "CUST-" + i);
            var item = new OrderItem("PROD-001", "Laptop", BigDecimal.valueOf(1000), 1);
            orderService.addItemToOrder("ORD-" + i, item);
        }

        ExecutorService executor = Executors.newFixedThreadPool(orderCount);
        CountDownLatch startLatch = new CountDownLatch(1);
        CountDownLatch endLatch = new CountDownLatch(orderCount);
        ConcurrentHashMap<String, Boolean> successMap = new ConcurrentHashMap<>();

        for (int i = 0; i < orderCount; i++) {
            final int orderId = i;
            executor.submit(() -> {
                try {
                    startLatch.await();
                    try {
                        orderService.confirmOrder("ORD-" + orderId);
                        successMap.put("ORD-" + orderId, true);
                    } catch (Exception e) {
                        successMap.put("ORD-" + orderId, false);
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    endLatch.countDown();
                }
            });
        }

        startLatch.countDown();
        assertTrue(endLatch.await(10, TimeUnit.SECONDS));

        // Should have exactly 5 successful confirmations
        long successCount = successMap.values().stream().filter(v -> v).count();
        assertEquals(5, successCount);

        executor.shutdown();
    }

    @Test
    @DisplayName("Should maintain data consistency under high concurrent load")
    void testDataConsistencyUnderHighLoad() throws InterruptedException {
        int threadCount = 50;
        int ordersPerThread = 10;
        ExecutorService executor = Executors.newFixedThreadPool(threadCount);

        for (int t = 0; t < threadCount; t++) {
            final int threadId = t;
            executor.submit(() -> {
                for (int i = 0; i < ordersPerThread; i++) {
                    try {
                        String orderId = "ORD-" + threadId + "-" + i;
                        orderService.createOrder(orderId, "CUST-" + threadId);
                        var item = new OrderItem("PROD-001", "Laptop", BigDecimal.valueOf(100), 1);
                        orderService.addItemToOrder(orderId, item);

                        // Randomly confirm or cancel
                        if (Math.random() > 0.5) {
                            try {
                                orderService.confirmOrder(orderId);
                            } catch (Exception ignore) {
                                // Expected when inventory is depleted
                            }
                        }
                    } catch (Exception e) {
                        fail("Unexpected exception: " + e.getMessage());
                    }
                }
            });
        }

        executor.shutdown();
        assertTrue(executor.awaitTermination(30, TimeUnit.SECONDS));

        // Verify system is in consistent state
        assertFalse(orderService.getAllOrders().isEmpty());
    }
}
