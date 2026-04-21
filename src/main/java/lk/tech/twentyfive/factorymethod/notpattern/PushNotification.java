package lk.tech.twentyfive.factorymethod.notpattern;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PushNotification {
    private String appId;
    private String pushMessage;

    public void sendPush() {
        System.out.println("Sending push message: " + pushMessage);
    }
}
