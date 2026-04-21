package lk.tech.twentyfive.proxy;

public class MainSort {

    public static void main(String[] args) {
        MergeSortService sortService = new MergeSortService();
        sortService.sort(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        SortService timedSortService = new ProxyTimedMergeSortService(sortService);
        timedSortService.sort(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    }
}
