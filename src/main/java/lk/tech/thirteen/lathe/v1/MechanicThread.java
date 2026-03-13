package lk.tech.thirteen.lathe.v1;

import lk.tech.thirteen.lathe.Lathe;

public class MechanicThread extends Thread {

    private final Lathe lathe;

    public MechanicThread(Lathe lathe) {
        this.lathe = lathe;
    }

    @Override
    public void run() {
        try {
            synchronized (lathe) {
                System.out.println(Thread.currentThread().getName() + " початок роботи");
                Thread.sleep(5_000);
                System.out.println(Thread.currentThread().getName() + " кінець роботи");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
