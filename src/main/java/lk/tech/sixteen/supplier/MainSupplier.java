package lk.tech.sixteen.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class MainSupplier {
    private static final List<String> NAME_LIST = List.of("Leonid", "Olya", "Maria");

    public static void main(String[] args) {
        List<String> list = randomNames(10, () -> NAME_LIST.get((int) (Math.random() * NAME_LIST.size())));
        System.out.println(list);

        UnaryOperator<Integer> m = UnaryOperator.identity();
    }

    public static List<String> randomNames(int size, NameGenerator generator) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(generator.generate());
        }
        return list;
    }
}
