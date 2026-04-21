package lk.tech.twentyfive.factorymethod.notpattern;

public class MainNotFactory {
    public static void main(String[] args) {
        String system = "sms";
        String message = "Hello World!!!";
        String to = "+322223";

        if (system.equals("sms")) {
            SmsNotification notification = new SmsNotification(message, to);
            notification.sendSms();
        } else if (system.equals("viber")) {
            ViberNotification notification = new ViberNotification(message, to);
            notification.sendViberMessage();
        } else if (system.equals("push")) {
            PushNotification notification = new PushNotification(message, to);
            notification.sendPush();
        }
    }
}
