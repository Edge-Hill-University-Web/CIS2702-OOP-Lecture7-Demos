package com.example.template_example;

// Client code
public class TemplateMethodDemo {
    public static void main(String[] args) {

        System.out.println("=== Online Order ===");
        OrderProcessTemplate onlineOrder = new OnlineStoreOrder();
        onlineOrder.processOrder();

        System.out.println("\n=== Retail Order ===");
        OrderProcessTemplate retailOrder = new RetailStoreOrder();
        retailOrder.processOrder();
    }
}