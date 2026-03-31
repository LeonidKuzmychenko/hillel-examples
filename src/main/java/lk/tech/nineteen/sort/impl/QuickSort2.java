package lk.tech.nineteen.sort.impl;

import lk.tech.nineteen.sort.Sort;

import java.util.concurrent.ThreadLocalRandom;

public class QuickSort2 implements Sort {

    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] arr, int low, int high) {
        while (low < high) {

            int pivotIndex = partition(arr, low, high);

            if (pivotIndex - low < high - pivotIndex) {
                quickSort(arr, low, pivotIndex - 1);
                low = pivotIndex + 1;
            } else {
                quickSort(arr, pivotIndex + 1, high);
                high = pivotIndex - 1;
            }
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivotIndex = ThreadLocalRandom.current().nextInt(low, high + 1);
        swap(arr, pivotIndex, high);

        int pivot = arr[high];
        int i = low;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                swap(arr, i++, j);
            }
        }

        swap(arr, i, high);
        return i;
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}