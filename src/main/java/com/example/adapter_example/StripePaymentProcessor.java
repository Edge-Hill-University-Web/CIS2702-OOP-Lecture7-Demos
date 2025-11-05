package com.example.adapter_example;

class StripePaymentProcessor implements PaymentProcessor {
    @Override
    public boolean processPayment(double amount, String currency) {
        System.out.println("Stripe: Processing " + amount + " " + currency);
        return true;
    }
  
    @Override
    public String getProviderName() {
        return "Stripe Payment Gateway";
    }
}