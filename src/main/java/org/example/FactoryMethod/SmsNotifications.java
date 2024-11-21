package org.example.FactoryMethod;

public class SmsNotifications implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending SMS Notifications");
    }
}

