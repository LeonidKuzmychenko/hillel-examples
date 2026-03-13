package lk.tech.thirteen.lathe.v1;

import lk.tech.thirteen.lathe.Lathe;


public class Main {

    public static void main(String[] args) {
        Lathe lathe = new Lathe();
        MechanicThread mechanicThread1 = new MechanicThread(lathe);
        mechanicThread1.setName("mechanicThread1");
        MechanicThread mechanicThread2 = new MechanicThread(lathe);
        mechanicThread2.setName("mechanicThread2");

        mechanicThread1.start();
        mechanicThread2.start();
    }
}
