package lk.tech.thirteen.executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //багато невеликих потоків
        Executors.newCachedThreadPool();

        //середенє тяжкі операції
        Executors.newFixedThreadPool(7);

        //всього 1 задача
        Executors.newSingleThreadExecutor();

        //всього 1 задача за разкладом
        Executors.newSingleThreadScheduledExecutor();

        //кілька завдань за разкладом
        Executors.newScheduledThreadPool(1);

        //середенє тяжкі операції CPU
        Executors.newWorkStealingPool();

        //
        Executors.newVirtualThreadPerTaskExecutor();
    }

}
