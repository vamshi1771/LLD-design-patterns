package org.example.FactoryMethod;

public class PushNotifications implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending Push Notifications");
    }
}
