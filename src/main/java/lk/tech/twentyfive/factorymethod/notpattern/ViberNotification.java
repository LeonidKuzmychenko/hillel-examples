package lk.tech.twentyfive.factorymethod.notpattern;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ViberNotification {
    private String phoneNumber;
    private String viberMessage;

    public void sendViberMessage(){
        System.out.println("Sending ViberMessage: " + viberMessage);
    }
}
