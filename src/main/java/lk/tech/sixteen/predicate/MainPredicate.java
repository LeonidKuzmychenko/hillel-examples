package lk.tech.sixteen.predicate;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class MainPredicate {

    public static void main(String[] args) {
        List<Double> list = List.of(1.);
        double max = find(list, (int1, int2) -> int1 > int2);
        double min = find(list, (int1, int2) -> int1 < int2);
        System.out.println(list);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    public static <T> T find(List<T> list, BiPredicate<T, T> predicate){
        if (list.isEmpty()){
            throw new IllegalArgumentException("List size is 0");
        }
        T findElement = list.get(0);
        for (int i = 1; i < list.size(); i++)
            if (predicate.test(list.get(i), findElement))
                findElement = list.get(i);
        return findElement;
    }
}
