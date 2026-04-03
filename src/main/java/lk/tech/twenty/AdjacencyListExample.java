package lk.tech.twenty;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyListExample {
    public static void main(String[] args) {
        // Кількість вершин у графі
        int vertices = 5;
        
        // Створення списків суміжності графа
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        
        // Додавання ребер до списків суміжності
        addEdge(adjacencyList, 0, 1);
        addEdge(adjacencyList, 0, 3);
        addEdge(adjacencyList, 1, 2);
        addEdge(adjacencyList, 1, 3);
        addEdge(adjacencyList, 1, 4);
        addEdge(adjacencyList, 2, 4);
        addEdge(adjacencyList, 3, 4);
        
        // Виведення списків суміжності
        System.out.println("Списки суміжності графа:");
        for (int i = 0; i < vertices; i++) {
            System.out.print("Вершина " + i + ": ");
            for (int neighbor : adjacencyList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
    
    // Метод для додавання ребра до списків суміжності
    private static void addEdge(List<List<Integer>> adjacencyList, int source, int destination) {
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source); // для ненапрямленого графа
    }
}