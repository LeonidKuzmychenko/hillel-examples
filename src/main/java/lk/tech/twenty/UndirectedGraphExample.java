package lk.tech.twenty;

import java.util.*;

public class UndirectedGraphExample {
    public static void main(String[] args) {
        // Створення ненапрямленого графа
        Map<Integer, Set<Integer>> graph = new HashMap<>();

        // Додавання ребер до графа
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 1);
        addEdge(graph, 2, 3);
        addEdge(graph, 4, 4);

        // Виведення графа
        System.out.println("Ненапрямлений граф:");
        for (Map.Entry<Integer, Set<Integer>> entry : graph.entrySet()) {
            int vertex = entry.getKey();
            Set<Integer> neighbors = entry.getValue();
            for (int neighbor : neighbors) {
                if (vertex < neighbor) {
                    System.out.println(vertex + " -- " + neighbor);
                }
            }
        }
    }

    // Метод для додавання ребра до графа
    private static void addEdge(Map<Integer, Set<Integer>> graph, int vertex1, int vertex2) {
        graph.putIfAbsent(vertex1, new HashSet<>());
        graph.putIfAbsent(vertex2, new HashSet<>());
        graph.get(vertex1).add(vertex2);
        graph.get(vertex2).add(vertex1);
    }
}