package lk.tech.fourteen.deque;

import java.util.ArrayDeque;
import java.util.Deque;

//автобус
//два входи
//два виходи
public class MainArrayDeque {

    public static void main(String[] args) {
        Deque<String> bus = new ArrayDeque<>();

        bus.addLast("Anna");
        bus.addLast("Oleg");

        bus.addFirst("Maria");
        bus.addFirst("Ivan");

        System.out.println("Passengers in bus: " + bus);

        String exitFront = bus.pollFirst();
        System.out.println(exitFront + " left through the front door");

        String exitBack = bus.pollLast();
        System.out.println(exitBack + " left through the back door");

        System.out.println("Remaining passengers: " + bus);
    }
}