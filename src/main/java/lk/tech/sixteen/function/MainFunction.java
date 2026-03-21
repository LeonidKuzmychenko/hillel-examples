package lk.tech.sixteen.function;

import java.util.List;
import java.util.function.Function;

public class MainFunction {

    public static void main(String[] args) {
        char[] chars = map("1234", s -> s.toCharArray());


        int length = map("1234", String::length);

        System.out.println(length);


        //method refer
        List.of(1).forEach(System.out::println);
    }


    public static <T, R> R map(T value,Function<T, R> func) {
        return func.apply(value);
    }

}
