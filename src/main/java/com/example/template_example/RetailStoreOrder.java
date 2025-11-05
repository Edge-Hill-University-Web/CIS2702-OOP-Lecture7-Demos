package com.example.template_example;

// Concrete class for retail store orders
class RetailStoreOrder extends OrderProcessTemplate {

    @Override
    protected void selectItem() {
        System.out.println("Customer picked an item from the shop shelf.");
    }

    @Override
    protected void makePayment() {
        System.out.println("Customer paid in cash at the counter.");
    }

    @Override
    protected void deliverItem() {
        System.out.println("Customer took the item home directly.");
    }
}
