package com.example.adapter_example;

public interface PaymentProcessor {
    boolean processPayment(double amount, String currency);
    String getProviderName();
}