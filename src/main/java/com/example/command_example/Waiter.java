package com.example.command_example;

import java.util.ArrayList;
import java.util.List;

// Invoker – The Waiter
class Waiter {
    private List<OrderCommand> orderList = new ArrayList<>();

    public void takeOrder(OrderCommand order) {
        orderList.add(order);
        System.out.println("Waiter: Order noted.");
    }

    public void sendOrdersToKitchen() {
        System.out.println("\nWaiter: Sending orders to the kitchen...");
        for (OrderCommand order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}