package lk.tech.thirteen.exchanger;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class GameTradeSystem {
    // Спільний обмінник для назв предметів
    private static final Exchanger<String> TRADE_EXCHANGER = new Exchanger<>();

    public static void main(String[] args) {
        // Гравець 1
        Thread player1 = new Thread(() -> {
            String itemToSend = "Меч вогню";
            try {
                System.out.println("Гравець 1: Виставив на обмін " + itemToSend);
                
                // Чекаємо на підтвердження від іншого гравця
                String receivedItem = TRADE_EXCHANGER.exchange(itemToSend, 10, TimeUnit.SECONDS);
                
                System.out.println("Гравець 1: Успішно отримав " + receivedItem);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException e) {
                System.err.println("Гравець 1: Час очікування вийшов! Другий гравець не підтвердив обмін.");
            }
        });

        // Гравець 2
        Thread player2 = new Thread(() -> {
            String itemToSend = "Щит льоду";
            try {
                // Імітуємо затримку (гравець перевіряє свій інвентар)
                Thread.sleep(3000);
                
                System.out.println("Гравець 2: Виставив на обмін " + itemToSend);
                
                // Обмін!
                String receivedItem = TRADE_EXCHANGER.exchange(itemToSend, 10, TimeUnit.SECONDS);
                
                System.out.println("Гравець 2: Успішно отримав " + receivedItem);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException e) {
                System.err.println("Гравець 2: Обмін скасовано через тайм-аут.");
            }
        });

        player1.start();
        player2.start();
    }
}