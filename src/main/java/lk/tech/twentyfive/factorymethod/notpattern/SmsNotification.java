package lk.tech.twentyfive.factorymethod.notpattern;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SmsNotification {
    private String phoneNumber;
    private String smsMessage;

    public void sendSms(){
        System.out.println("Sending SMS: " + smsMessage);
    }
}
