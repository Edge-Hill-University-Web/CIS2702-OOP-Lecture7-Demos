package com.example.adapter_example;

class LegacyPaymentAdapter implements PaymentProcessor {
    private LegacyPaymentSystem legacySystem;
    private String defaultAccount;
  
    public LegacyPaymentAdapter(LegacyPaymentSystem legacySystem, String account) {
        this.legacySystem = legacySystem;
        this.defaultAccount = account;
    }
  
    @Override
    public boolean processPayment(double amount, String currency) {
        // Validate currency
        if (!currency.equals("GBP")) {
            System.out.println("Error: Legacy system only supports GBP");
            return false;
        }
      
        // Convert decimal pounds to pounds and pence
        int pounds = (int) amount;
        int pence = (int) Math.round((amount - pounds) * 100);
      
        // Translate to legacy interface
        legacySystem.makeTransaction(defaultAccount, pounds, pence);
      
        // Check if successful
        return legacySystem.checkTransactionStatus(defaultAccount);
    }
  
    @Override
    public String getProviderName() {
        return legacySystem.getSystemName() + " (via Adapter)";
    }
}
