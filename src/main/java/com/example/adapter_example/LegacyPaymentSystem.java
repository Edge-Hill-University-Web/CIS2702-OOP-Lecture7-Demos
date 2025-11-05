package com.example.adapter_example;

class LegacyPaymentSystem {
    public void makeTransaction(String accountNumber, int pounds, int pence) {
        System.out.println("Legacy System: Processing £" + pounds + "." + 
                         String.format("%02d", pence) + 
                         " from account " + accountNumber);
    }
  
    public boolean checkTransactionStatus(String accountNumber) {
        // Simulate checking transaction status
        return true;
    }
  
    public String getSystemName() {
        return "Legacy Payment Gateway v1.0";
    }
}
