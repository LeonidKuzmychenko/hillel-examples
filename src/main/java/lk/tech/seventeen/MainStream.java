package lk.tech.seventeen;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStream {

    public static void main(String[] args) {
        List<Integer> list = List.of(8, 2, 2, 2, 5, 7, 1, 3);

        List<Integer> listEven = list.stream().filter((it) -> it % 2 == 0).toList();
        System.out.println(listEven);

//        List<String> stringList = list.stream()//зробили stream
//                .distinct()//прибрати дублікати значень (перехідна операція)
//                .filter((it) -> it % 2 == 0)//фільтрування парних елементів (перехідна операція)
//                .sorted()//природне сортування (перехідна операція)
//                .map(String::valueOf)//виконали перетворення типу даних (перехідна операція)
//                .toList();//побудували List (термінальна операція)

        String collect = list.stream()
                .distinct()
                .filter((it) -> it % 2 == 0)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(";"));

        System.out.println(collect);



    }
}
