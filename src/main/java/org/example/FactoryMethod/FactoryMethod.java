package org.example.FactoryMethod;

public class FactoryMethod {
    public static void main(String[] args){


        NotificationFactory notification1;


        // here factory class is taking care of creating object for notification without letting know to client
        notification1 = new EmailNotificationFactory();
        Notification email = notification1.createNotifications();
        email.notifyUser();

//        notification1 = new EmailNotificationFactory();
//        notification1.notify();


    }
}
