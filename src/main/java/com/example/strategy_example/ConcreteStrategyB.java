package com.example.strategy_example;

public class ConcreteStrategyB implements Strategy {
    @Override
    public String execute(String data) {
        if (data == null) return "ConcreteStrategyB processed: ";
        return "ConcreteStrategyB processed: " + new StringBuilder(data).reverse().toString();
    }
}
