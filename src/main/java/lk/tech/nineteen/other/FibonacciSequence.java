package lk.tech.nineteen.other;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {
    public static void main(String[] args) {

        List<Integer> fibonacciSequence = new ArrayList<>();
        fibonacciSequence.add(0);
        fibonacciSequence.add(1);
        int n = 12;
        for (int i = 2; i <= n; i++) {
            int pre = fibonacciSequence.get(i-1);
            int prepre = fibonacciSequence.get(i-2);
            fibonacciSequence.add(prepre+pre);
        }

        System.out.println(fibonacciSequence);
    }

//    static int fibonacci(int n) {
//        if (n <= 1) {
//            return n;
//        }
//        return fibonacci(n - 1) + fibonacci(n - 2);
//    }
}