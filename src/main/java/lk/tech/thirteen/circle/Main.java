package lk.tech.thirteen.circle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CyclicBarrier;

public class Main {

    public static void main(String[] args) {
        List<Person> people = Collections.synchronizedList(new ArrayList<>());

        CyclicBarrier cb = new CyclicBarrier(3, new BarrierAction(people));

        for (int i = 0; i < 3; i++) {
            new Thread(new Worker(people, cb), "Manager" + i).start();
        }
    }
}