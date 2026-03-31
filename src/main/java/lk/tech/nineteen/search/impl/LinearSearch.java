package lk.tech.nineteen.search.impl;

import lk.tech.nineteen.search.Search;

public class LinearSearch implements Search {

    //6
    // 1 2 3 4 5 6 7 8

    @Override
    public int search(int[] array, int findValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == findValue) {
                return i;
            }
        }
        return -1;
    }
}