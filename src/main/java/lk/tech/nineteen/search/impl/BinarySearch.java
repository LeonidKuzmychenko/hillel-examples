package lk.tech.nineteen.search.impl;

import lk.tech.nineteen.search.Search;

public class BinarySearch implements Search {


    //6
    // 1 2 3 4 5 6 7 8
    // 1 2 3 |4| 5 |6| |7| 8
    @Override
    public int search(int[] array, int findValue) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + ((right - left) >>> 1);
            int midVal = array[mid];

            if (midVal == findValue) {
                return mid;
            }
            if (midVal < findValue) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
    //0 | 1 2 3 4 5 6 7
}

