package lk.tech.fourteen.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainArrayList {

    public static void main(String[] args) {
        // створюємо ArrayList
        List<String> fruits = new LinkedList<>();

        System.out.println("Creating ArrayList...");

        // додаємо елементи
        fruits.add("Apple");
        //mango
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("After adding elements: " + fruits);

        // додаємо елемент за індексом
        fruits.add(1, "Mango");

        System.out.println("After inserting element at index 1: " + fruits);

        // отримуємо елемент за індексом
        String element = fruits.get(2);
        System.out.println("Element at index 2: " + element);

        // змінюємо елемент
        fruits.set(0, "Pineapple");

        System.out.println("After replacing element at index 0: " + fruits);

        // перевіряємо наявність елемента
        boolean contains = fruits.contains("Banana");
        System.out.println("Contains Banana: " + contains);

        // розмір списку
        System.out.println("Size of list: " + fruits.size());

        // видаляємо елемент за індексом
        fruits.remove(2);

        System.out.println("After removing element at index 2: " + fruits);

        // сортуємо список
        Collections.sort(fruits);

        System.out.println("After sorting: " + fruits);

        // проходимося по списку
        System.out.println("Iterating through list:");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // очищаємо список
        fruits.clear();

        System.out.println("After clearing list: " + fruits);
    }
}