package com.example.strategy_example;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public String performOperation(String data) {
        return strategy.execute(data);
    }
}
