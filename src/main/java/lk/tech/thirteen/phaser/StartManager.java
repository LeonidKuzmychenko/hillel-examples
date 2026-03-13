package lk.tech.thirteen.phaser;

import java.util.concurrent.Phaser;

public class StartManager implements Runnable {

    private final Phaser phaser;
    private final String name;

    public StartManager(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register();
    }

    @Override
    public void run() {
        System.out.println(name + " пускає людей...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        System.out.println(name + " закінчив.");
        // Повідомляємо про завершення і відразу відписуємося від фазера
        phaser.arriveAndDeregister();
    }
}
