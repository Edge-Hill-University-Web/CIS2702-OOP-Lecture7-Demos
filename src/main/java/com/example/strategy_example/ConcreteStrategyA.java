package com.example.strategy_example;

public class ConcreteStrategyA implements Strategy {
    @Override
    public String execute(String data) {
        return "ConcreteStrategyA processed: " + (data == null ? "" : data.toUpperCase());
    }
}
