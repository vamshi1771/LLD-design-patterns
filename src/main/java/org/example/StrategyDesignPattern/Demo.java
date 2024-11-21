package org.example.StrategyDesignPattern;

public class Demo {
    public static void main(String[] args){

        paymentProcessorContext processorContext = new paymentProcessorContext();

        paymentStrategy strategy = new UpiPayment();
        processorContext.setPaymentStrategy(strategy);
        processorContext.executePayment(50);
    }
}
