package lk.tech.thirteen.lathe.v3;

import lk.tech.thirteen.lathe.Lathe;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.function.Supplier;

public class MechanicThread extends Thread {

    private final Lathe lathe;
    private final Lock lock;

    public MechanicThread(Lock lock, Lathe lathe) {
        this.lathe = lathe;
        this.lock = lock;
    }

    @Override
    public void run() {
        List<Supplier<Boolean>> workParts = new ArrayList<>();
        workParts.add(() -> {
            System.out.println(Thread.currentThread().getName() + " робота 1");
            return true;
        });
        workParts.add(() -> {
            boolean tryLock = lock.tryLock();
            if (tryLock) {
                System.out.println(Thread.currentThread().getName() + " початок роботи 2");
                try {
                    Thread.sleep(2_000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " кінець роботи 2");
                lock.unlock();
            }
            return tryLock;
        });

        workParts.add(() -> {
            System.out.println(Thread.currentThread().getName() + " робота 3");
            return true;
        });

        while (!workParts.isEmpty() && !Thread.currentThread().isInterrupted()) {
            for (int i = 0; i < workParts.size(); i++) {
                boolean resultPart = workParts.get(i).get();
                if (resultPart) {
                    workParts.remove(i);
                    i--;
                }
            }
        }
    }


}
