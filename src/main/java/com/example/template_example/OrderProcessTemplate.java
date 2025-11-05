package com.example.template_example;

// Abstract class defining the template method
abstract class OrderProcessTemplate {

    // Template method – defines the steps of the algorithm
    public final void processOrder() {
        selectItem();
        makePayment();
        deliverItem();
    }

    // Abstract steps – subclasses must implement these
    protected abstract void selectItem();
    protected abstract void makePayment();
    protected abstract void deliverItem();
}
