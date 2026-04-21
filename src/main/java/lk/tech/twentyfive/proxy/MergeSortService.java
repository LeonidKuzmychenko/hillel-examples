package lk.tech.twentyfive.proxy;

public class MergeSortService implements SortService {
    @Override
    public void sort(int[] ints) {
        try {
            System.out.println("start sort");
            Thread.sleep(1000);
            System.out.println("end sort");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
