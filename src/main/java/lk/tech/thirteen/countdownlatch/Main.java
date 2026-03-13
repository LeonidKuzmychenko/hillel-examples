package lk.tech.thirteen.countdownlatch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Main {

    public static void main(String[] args) {
        List<Integer> popcornPack = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            popcornPack.add(i);
        }
        System.out.println(popcornPack);

        final CountDownLatch countDownLatch = new CountDownLatch((int)(popcornPack.size() * 0.8));
        Thread thread = new Thread(() -> {
            for (Integer integer : popcornPack) {
                System.out.println("Popcorn №" + integer + " is done");
                countDownLatch.countDown();
            }
        });

        thread.start();

        try {
            countDownLatch.await();
            System.out.println("Bigger part of popcorn is done");
        } catch (InterruptedException e) {

        }
    }
}