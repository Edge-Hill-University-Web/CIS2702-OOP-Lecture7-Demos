package com.example.adapter_example;

// Usage
public class AdapterDemo {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
      
        // Modern payment processor - works directly
        PaymentProcessor stripe = new StripePaymentProcessor();
        service.executePayment(stripe, 99.99, "GBP");
      
        // Legacy system - needs adapter
        LegacyPaymentSystem legacy = new LegacyPaymentSystem();
        PaymentProcessor adapter = new LegacyPaymentAdapter(legacy, "ACC-12345");
        service.executePayment(adapter, 149.50, "GBP");
      
    }
}

