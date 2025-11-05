package com.example.strategy_example;

public class StrategyDemo {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        String input = "hello strategy";

        System.out.println("Using ConcreteStrategyA:");
        System.out.println(context.performOperation(input));

        System.out.println("\nSwitching to ConcreteStrategyB at runtime:");
        context.setStrategy(new ConcreteStrategyB());
        System.out.println(context.performOperation(input));
    }
}
