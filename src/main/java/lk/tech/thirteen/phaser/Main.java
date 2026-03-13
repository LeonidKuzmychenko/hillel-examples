package lk.tech.thirteen.phaser;

import java.util.concurrent.Phaser;

public class Main {

    public static void main(String[] args) {
        // Створюємо Phaser з власною логікою переходу
        Phaser phaser = new Phaser(0){
            @Override
            protected boolean onAdvance(int phase, int registeredParties) {
                if (phase == 0){
                    System.out.println("Фаза 0 закінчилась");
                }
                return true;
            }
        };

        // --- ФАЗА 0: Менеджери на входах ---
        for (int i = 1; i <= 3; i++) {
            new Thread(new StartManager(phaser, "Менеджер Входу #" + i)).start();
        }

        // Чекаємо завершення фази 0 у головному потоці, щоб запустити нових менеджерів
        phaser.awaitAdvance(0);
        // --- ФАЗА 1: Нові менеджери ---
        // Важливо: оскільки 3 менеджери з фази 0 зроблять arriveAndDeregister, 
        // нам потрібно додати 2 нових
        new Thread(new EquipmentManager(phaser, "Менеджер Футболок")).start();
        new Thread(new EquipmentManager(phaser, "Менеджер Плакатів")).start();

        phaser.awaitAdvance(1);
    }

}