package org.example.FactoryMethod;

public class EmailNotification implements  Notification{

    @Override
    public void notifyUser() {
        System.out.println("Sending Email Notifications");
    }
}

