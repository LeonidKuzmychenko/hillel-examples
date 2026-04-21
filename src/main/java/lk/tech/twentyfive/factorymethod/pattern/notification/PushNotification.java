package lk.tech.twentyfive.factorymethod.pattern.notification;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PushNotification implements Notification {
    private String appId;
    private String pushMessage;

    @Override
    public void send() {
        System.out.println("Sending push message: " + pushMessage);
    }
}
