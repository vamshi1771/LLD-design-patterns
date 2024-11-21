package org.example.FactoryMethod;

public class EmailNotificationFactory extends NotificationFactory {

    @Override
    public Notification createNotifications() {
        return new EmailNotification();
    }
}

