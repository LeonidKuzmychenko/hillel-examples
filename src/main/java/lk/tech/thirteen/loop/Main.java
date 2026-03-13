package lk.tech.thirteen.loop;


public class Main {
    public static void main(String[] args) {
        SeasonsChangerThread seasonsChangerThread = new SeasonsChangerThread();
        seasonsChangerThread.start();

        seasonsChangerThread.interrupt();
    }
}