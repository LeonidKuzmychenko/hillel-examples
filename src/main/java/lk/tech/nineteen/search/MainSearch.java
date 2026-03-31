package lk.tech.nineteen.search;

import lk.tech.nineteen.search.impl.LinearSearch;
import lk.tech.nineteen.utils.Data;
import lk.tech.nineteen.utils.Timed;

import java.util.Map;

public class MainSearch {

    public static void main(String[] args) {
        Data data = new Data(1000000);

        Search search = new LinearSearch();

        Timed.run("sorted", () -> {
            int findIndex = search.search(data.sorted(), 99999);
            System.out.println("findIndex: " + findIndex);
        });

        Timed.run("random", () -> {
            int findIndex = search.search(data.random(), 99999);
            System.out.println("findIndex: " + findIndex);
        });

        Timed.run("map", () -> {
            Map<Integer, Integer> map = data.map();
            Integer i = map.get(9999999);
            System.out.println("findValue: " + i);
        });
    }
}
