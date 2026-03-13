package lk.tech.thirteen.loop;

public class SeasonsChangerThread extends Thread {

    private Seasons season = Seasons.SPRING;

    @Override
    public void run() {
       while(!Thread.currentThread().isInterrupted()) {
           System.out.println("Поточний сезон: " + season);
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               Thread.currentThread().interrupt();
               break;
           }
           season = Seasons.next(season);
       }
    }
}
