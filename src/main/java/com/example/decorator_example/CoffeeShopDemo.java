package com.example.decorator_example;

// Client code
public class CoffeeShopDemo {
    public static void main(String[] args) {
        // Start with a plain coffee
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " £" + coffee.getCost());

        // Add milk
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " £" + coffee.getCost());

        // Add sugar
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " £" + coffee.getCost());

        // Add whipped cream
        coffee = new WhippedCreamDecorator(coffee);
        System.out.println(coffee.getDescription() + " £" + coffee.getCost());
    }
}