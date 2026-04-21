package lk.tech.twentyfive.factorymethod.pattern;

import lk.tech.twentyfive.factorymethod.pattern.notification.Notification;
import lk.tech.twentyfive.factorymethod.pattern.notification.PushNotification;
import lk.tech.twentyfive.factorymethod.pattern.notification.SmsNotification;
import lk.tech.twentyfive.factorymethod.pattern.notification.ViberNotification;

public class NotificationFactory {

    public Notification create(String text, String to, String type) {
        return switch (type) {
            case "sms" -> new SmsNotification(text, to);
            case "viber" -> new ViberNotification(text, to);
            case "push" -> new PushNotification(text, to);
            default -> throw new IllegalArgumentException(type + " is unknown");
        };
    }
}
