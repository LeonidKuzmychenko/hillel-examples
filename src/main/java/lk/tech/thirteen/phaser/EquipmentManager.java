package lk.tech.thirteen.phaser;

import java.util.concurrent.Phaser;

class EquipmentManager implements Runnable {
    private final Phaser phaser;
    private final String name;

    EquipmentManager(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        this.phaser.register(); // Новий менеджер реєструється
    }

    @Override
    public void run() {
        System.out.println(name + " роздає екіпірування...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {

        }
        System.out.println(name + " закінчив.");
        phaser.arriveAndDeregister();
    }
}