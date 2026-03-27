package lk.tech.thirteen.executors;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

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

        ForkJoinPool.commonPool().execute(new FindMaxTask(List.of(1,2,3,4)));

        //
        Executors.newVirtualThreadPerTaskExecutor();
    }

}
