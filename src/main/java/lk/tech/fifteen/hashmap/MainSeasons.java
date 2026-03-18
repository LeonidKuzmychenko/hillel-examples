package lk.tech.fifteen.hashmap;

public class MainSeasons {
    public static void main(String[] args){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Season season = Season.SPRING;
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println(season);
                    season = Season.next(season);
                }
            }
        });

        thread.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread.interrupt();

    }
}
