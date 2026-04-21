package lk.tech.twentyfive.factorymethod.pattern.notification;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SmsNotification implements Notification{
    private String phoneNumber;
    private String smsMessage;


    @Override
    public void send() {
        System.out.println("Sending SMS: " + smsMessage);
    }
}
