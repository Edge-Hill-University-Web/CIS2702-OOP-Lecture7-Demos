package com.example.template_example;

// Concrete class for online store orders
class OnlineStoreOrder extends OrderProcessTemplate {

    @Override
    protected void selectItem() {
        System.out.println("Customer selected an item from the online catalogue.");
    }

    @Override
    protected void makePayment() {
        System.out.println("Processing online payment through payment gateway.");
    }

    @Override
    protected void deliverItem() {
        System.out.println("Item delivered via courier service.");
    }
}