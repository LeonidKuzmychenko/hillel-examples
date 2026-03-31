package lk.tech.nineteen.sort.impl;

import lk.tech.nineteen.sort.Sort;

public class MergeSort implements Sort {

    @Override
    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    public void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Рекурсивно сортуємо ліву і праву половини
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Зливаємо відсортовані половини
            merge(arr, left, mid, right);
        }
    }

    public void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Створюємо тимчасові підмасиви
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Копіюємо дані в тимчасові підмасиви
        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        // Зливаємо тимчасові підмасиви
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Копіюємо залишки L[], якщо такі є
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Копіюємо залишки R[], якщо такі є
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}