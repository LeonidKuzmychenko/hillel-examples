package lk.tech.nineteen.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.IntStream;

public class Data {

    private final int[] bestCase;
    private final int[] averageCase;
    private final int[] worstCase;
    private final Map<Integer, Integer> map;

    public Data(int size) {
        Random random = new Random(41);

        this.bestCase = createBestCase(size);
        this.averageCase = createAverageCase(size, random);
        this.worstCase = createWorstCase(size);
        this.map = createMap(size);
    }

    private Map<Integer, Integer> createMap(int size) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < this.bestCase.length; i++) {
            map.put(i, i * 2);
        }
        return map;
    }

    private int[] createBestCase(int size) {
        return IntStream.range(0, size).toArray();
    }

    private int[] createAverageCase(int size, Random random) {
        return random.ints(size, 0, size).toArray();
    }

    private int[] createWorstCase(int size) {
        int startValue = size - 1;
        return IntStream.iterate(startValue, i -> i - 1).limit(size).toArray();
    }

    public int[] sorted() {
        return bestCase;
    }

    public int[] random() {
        return averageCase;
    }

    public int[] inverted() {
        return worstCase;
    }

    public Map<Integer, Integer> map() {
        return this.map;
    }
}