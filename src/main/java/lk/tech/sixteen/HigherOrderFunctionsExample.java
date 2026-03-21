package lk.tech.sixteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.function.Predicate;

public class HigherOrderFunctionsExample {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1","2","3");

        List<String> filter = filter(numbers, s -> Integer.parseInt(s) % 2 != 0);

        System.out.println(filter);


    }

    public static <T> List<T> filter(List<T> numbers, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T number : numbers)
            if (predicate.test(number))
                result.add(number);
        return result;
    }
}