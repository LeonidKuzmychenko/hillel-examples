package lk.tech.twentyfive.factorymethod.pattern.notification;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ViberNotification implements  Notification {
    private String phoneNumber;
    private String viberMessage;

    @Override
    public void send() {
        System.out.println("Sending ViberMessage: " + viberMessage);
    }
}
