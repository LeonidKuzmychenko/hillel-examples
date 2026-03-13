package lk.tech.thirteen.lathe.v2;

import lk.tech.thirteen.lathe.Lathe;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

public class MechanicThread extends Thread {

    private final Lathe lathe;
    private final Lock lock;

    public MechanicThread(Lock lock, Lathe lathe) {
        this.lathe = lathe;
        this.lock = lock;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + " робота 1");

        boolean tryLock = false;
        try {
            tryLock = lock.tryLock(2, TimeUnit.SECONDS);
            //try work with lathe
            if (tryLock) {
                //work with lathe
                System.out.println(Thread.currentThread().getName() + " початок роботи 2");
                Thread.sleep(1_000);
                System.out.println(Thread.currentThread().getName() + " кінець роботи 2");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
        finally {
            if (tryLock) {
                lock.unlock();
            }
        }
        System.out.println(Thread.currentThread().getName() + " робота 3");

    }
}
