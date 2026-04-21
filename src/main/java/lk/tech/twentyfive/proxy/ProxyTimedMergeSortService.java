package lk.tech.twentyfive.proxy;

public class ProxyTimedMergeSortService implements SortService {

    private MergeSortService mergeSortService;

    public ProxyTimedMergeSortService(MergeSortService mergeSortService) {
        this.mergeSortService = mergeSortService;
    }

    @Override
    public void sort(int[] ints) {
        long startTime = System.nanoTime();
        mergeSortService.sort(ints);
        long endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime));
    }
}
