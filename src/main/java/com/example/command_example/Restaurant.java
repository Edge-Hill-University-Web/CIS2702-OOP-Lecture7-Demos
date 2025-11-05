package com.example.command_example;

// Client – The Customer
public class Restaurant {
    public static void main(String[] args) {
        Chef chef = new Chef();
        Waiter waiter = new Waiter();

        // Customer places orders
        waiter.takeOrder(new PastaOrder(chef));
        waiter.takeOrder(new SteakOrder(chef));
        waiter.takeOrder(new DessertOrder(chef));

        // Waiter sends all orders to the chef
        waiter.sendOrdersToKitchen();
    }
}