package lk.tech.nineteen.sort;

import lk.tech.nineteen.sort.impl.MergeSort;
import lk.tech.nineteen.utils.Data;
import lk.tech.nineteen.utils.Timed;

import java.util.Arrays;

public class MainSort {

    private static final Data data = new Data(100_000);
    private static final Sort sort = new MergeSort();

    public static void main(String[] args) {
        System.out.println("---- " + Arrays.class + " ----");
        Timed.run("sorted", () -> Arrays.parallelSort(data.sorted()));
        Timed.run("random", () -> Arrays.parallelSort(data.random()));
        Timed.run("inverted", () -> Arrays.parallelSort(data.inverted()));
    }
}