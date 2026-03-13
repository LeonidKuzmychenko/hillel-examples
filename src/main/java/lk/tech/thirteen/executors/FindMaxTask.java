package lk.tech.thirteen.executors;

import java.util.List;
import java.util.concurrent.RecursiveTask;

public class FindMaxTask extends RecursiveTask<Integer> {
    private final List<Integer> list;

    public FindMaxTask(List<Integer> list) {
        this.list = list;
    }


    @Override
    protected Integer compute() {

        int size = list.size();

        if (size == 1) {
            return list.get(0);
        }

        if (size == 2) {
            int max = Math.max(list.get(0), list.get(1));
            System.out.println("Максимальний з " + list.get(0) + ", " + list.get(1) + " є " + max);
            return max;
        }

        int mid = size / 2;

        FindMaxTask leftTask = new FindMaxTask(list.subList(0, mid));
        FindMaxTask rightTask = new FindMaxTask(list.subList(mid, size));

        leftTask.fork();

        int rightResult = rightTask.compute();

        int leftResult = leftTask.join();

        return Math.max(leftResult, rightResult);
    }
}
