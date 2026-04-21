package lk.tech.twentyfive.factorymethod.pattern;

import lk.tech.twentyfive.factorymethod.pattern.notification.Notification;

public class MainFactory {

    private static final NotificationFactory FACTORY = new NotificationFactory();

    public static void main(String[] args) {
        Notification notification = FACTORY.create("Hello World!", "+322223", "push");
        notification.send();
    }
}
