package lk.tech.nineteen.sort.impl;

import lk.tech.nineteen.sort.Sort;

public class SelectionSort implements Sort {
    @Override
    public void sort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Обмін поточного елементу з мінімальним елементом
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
