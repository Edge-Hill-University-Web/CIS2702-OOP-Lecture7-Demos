package com.example.decorator_example;

class WhippedCreamDecorator extends CoffeeDecorator {
    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", whipped cream";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.70;
    }
}
