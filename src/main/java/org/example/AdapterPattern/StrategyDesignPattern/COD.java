package org.example.AdapterPattern.StrategyDesignPattern;

public class COD implements paymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println(amount + "cash on delivery process");
    }

    public static class Main {
        public static void main(String[] args) {
            System.out.println("Hello world!");
        }
    }
}
