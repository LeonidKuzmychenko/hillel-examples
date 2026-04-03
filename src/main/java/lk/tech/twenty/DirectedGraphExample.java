package lk.tech.twenty;

import java.util.*;

public class DirectedGraphExample {
    public static void main(String[] args) {
        // Створення напрямленого графа
        Map<Integer, List<Integer>> graph = new HashMap<>();

        // Додавання ребер до графа
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 1);
        addEdge(graph, 2, 3);

        // Виведення графа
        System.out.println("Напрямленний граф:");
        for (Map.Entry<Integer, List<Integer>> entry : graph.entrySet()) {
            int source = entry.getKey();
            List<Integer> destinations = entry.getValue();
            for (int destination : destinations) {
                System.out.println(source + " -> " + destination);
            }
        }
    }

    // Метод для додавання ребра до графа
    private static void addEdge(Map<Integer, List<Integer>> graph, int source, int destination) {
        graph.putIfAbsent(source, new ArrayList<>());
        graph.get(source).add(destination);
    }
}