package org.example.FactoryMethod;

public class pushNotificationFactory extends NotificationFactory {

    @Override
    public Notification createNotifications() {
        return new PushNotifications();
    }
}
