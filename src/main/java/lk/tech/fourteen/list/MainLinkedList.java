package lk.tech.fourteen.list;

import java.util.LinkedList;

public class MainLinkedList {

    public static void main(String[] args) {

        // створюємо LinkedList
        LinkedList<String> people = new LinkedList<>();

        System.out.println("Creating LinkedList...");

        // додаємо елементи
        people.add("Anna");
        people.add("Oleg");
        people.add("Maria");

        System.out.println("After adding elements: " + people);

        // додаємо елемент на початок списку
        people.addFirst("Ivan");

        System.out.println("After addFirst: " + people);

        // додаємо елемент в кінець списку
        people.addLast("Olha");

        System.out.println("After addLast: " + people);

        // отримуємо перший елемент
        String first = people.getFirst();
        System.out.println("First element: " + first);

        // отримуємо останній елемент
        String last = people.getLast();
        System.out.println("Last element: " + last);

        // отримуємо елемент за індексом
        String byIndex = people.get(2);
        System.out.println("Element at index 2: " + byIndex);

        // видаляємо перший елемент
        people.removeFirst();
        System.out.println("After removeFirst: " + people);

        // видаляємо останній елемент
        people.removeLast();
        System.out.println("After removeLast: " + people);

        // видаляємо елемент за значенням
        people.remove("Oleg");
        System.out.println("After removing 'Oleg': " + people);

        // перевіряємо наявність елемента
        boolean contains = people.contains("Maria");
        System.out.println("Contains Maria: " + contains);

        // розмір списку
        System.out.println("Size of list: " + people.size());

        // проходимося по списку
        System.out.println("Iterating through LinkedList:");

        for (String person : people) {
            System.out.println(person);
        }

        // очищаємо список
        people.clear();
        System.out.println("After clearing list: " + people);
    }
}