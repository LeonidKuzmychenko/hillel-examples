package lk.tech.nineteen.utils;

import java.time.Duration;

public class Timed {

    public static void run(String type, Runnable runnable) {
        System.out.println("Input data type: " + type);
        long start = System.nanoTime();
        runnable.run();
        long end = System.nanoTime();
        System.out.println("time: " + Duration.ofNanos(end - start).toMillis() + " ms");
//        System.out.println("time: " + Duration.ofNanos(end - start).toNanos()+ " nanoseconds");
        System.out.println();
    }
}
