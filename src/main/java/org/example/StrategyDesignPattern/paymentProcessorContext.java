package org.example.StrategyDesignPattern;

public class paymentProcessorContext {
     private  paymentStrategy paymentStrategy;

     void setPaymentStrategy(paymentStrategy paymentStrategy){
         this.paymentStrategy = paymentStrategy;
     }

     void executePayment(double amount){
         if(paymentStrategy !=  null){
             paymentStrategy.processPayment(amount);
         }
         else System.out.println("No payment Strategy is selected");
     }
}
