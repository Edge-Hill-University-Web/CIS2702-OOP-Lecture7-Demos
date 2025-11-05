package com.example.adapter_example;

public class PaymentService {
    public void executePayment(PaymentProcessor processor, double amount, String currency) {
        System.out.println("\nUsing: " + processor.getProviderName());
        boolean success = processor.processPayment(amount, currency);
        System.out.println("Payment " + (success ? "successful" : "failed"));
    }
}