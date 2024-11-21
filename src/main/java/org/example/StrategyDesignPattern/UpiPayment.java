package org.example.StrategyDesignPattern;

public class UpiPayment implements paymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println(amount +"UPI payment is in process");
    }
}
