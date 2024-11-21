package org.example.FactoryMethod;

public class SmsNotificationFactory extends NotificationFactory {

    @Override
    public Notification createNotifications() {
        return new SmsNotifications();
    }
}

