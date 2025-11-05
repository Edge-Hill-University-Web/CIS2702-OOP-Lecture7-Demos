package com.example.decorator_example;

// Concrete component - basic coffee
class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple coffee";
    }

    @Override
    public double getCost() {
        return 2.00;
    }
}