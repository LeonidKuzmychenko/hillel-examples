package lk.tech.thirteen.lathe.v3;

import lk.tech.thirteen.lathe.Lathe;

import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Lathe lathe = new Lathe();

        MechanicThread mechanicThread1 = new MechanicThread(lock, lathe);
        mechanicThread1.setName("mechanicThread1");
        MechanicThread mechanicThread2 = new MechanicThread(lock, lathe);
        mechanicThread2.setName("mechanicThread2");

        mechanicThread1.start();
        mechanicThread2.start();
    }
}
