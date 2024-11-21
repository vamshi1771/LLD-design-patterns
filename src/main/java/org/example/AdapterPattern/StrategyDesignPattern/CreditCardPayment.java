package org.example.AdapterPattern.StrategyDesignPattern;

public class CreditCardPayment implements paymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println(amount + "CreditCard payment is in process");
    }
}
