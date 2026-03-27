package lk.tech.eighteen;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamGenerator {

    public static void main(String[] args) {

//        List<UUID> uuid = new ArrayList<>();

//        List<UUID> uuidList = Stream.generate(() -> UUID.randomUUID()).parallel().limit(10).toList();
//        System.out.println(uuidList);


        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        list.stream()
                .flatMap(it -> it % 2 == 0 ? Stream.of(it) : Stream.empty())
                .forEach(System.out::println);

    }
}
