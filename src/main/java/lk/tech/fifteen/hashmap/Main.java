package lk.tech.fifteen.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Double> map = new HashMap<>();
        map.put("банани", 5.);
        map.put("йогурт", 3.);
        map.put("філе куриці", 2.5);
        map.putIfAbsent("булочка", 5.);
        map.put(null, 1.);

        System.out.println(map);

        boolean isExistGood = map.containsKey("булочка");
        System.out.println(isExistGood);

//        Double count = map.get("булочка");

        Double count = map.getOrDefault("булочка", 0.);
        System.out.println(count);

    }
}
