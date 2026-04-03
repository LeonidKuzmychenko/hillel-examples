package lk.tech.twenty;

public class AdjacencyMatrixExample {
    public static void main(String[] args) {
        // Кількість вершин у графі
        int vertices = 5;
        
        // Створення матриці суміжності графа
        int[][] adjacencyMatrix = {
            {0, 1, 0, 1, 0},
            {1, 0, 1, 1, 1},
            {0, 1, 0, 0, 1},
            {1, 1, 0, 0, 1},
            {0, 1, 1, 1, 0}
        };
        
        // Виведення матриці суміжності
        System.out.println("Матриця суміжності графа:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}