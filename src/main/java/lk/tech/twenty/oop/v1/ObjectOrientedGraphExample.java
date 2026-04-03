package lk.tech.twenty.oop.v1;

public class ObjectOrientedGraphExample {
    public static void main(String[] args) {
        // Створення вершин графа
        Vertex[] vertices = new Vertex[7];
        for (int i = 0; i < vertices.length; i++) {
            vertices[i] = new Vertex(i);
        }

        // Додавання ребер до графа
        vertices[0].addEdge(vertices[1], 5);
        vertices[0].addEdge(vertices[2], 3);
        vertices[1].addEdge(vertices[3], 6);
        vertices[1].addEdge(vertices[4], 7);
        vertices[2].addEdge(vertices[5], 9);
        vertices[3].addEdge(vertices[6], 2);
        vertices[4].addEdge(vertices[6], 1);
        vertices[5].addEdge(vertices[6], 4);

        // Відображення графа
        System.out.println("Граф:");
        for (Vertex vertex : vertices) {
            System.out.print("Вершина " + vertex.getId() + ": ");
            for (Edge edge : vertex.getEdges()) {
                System.out.print("(" + edge.getSource().getId() + " -> "
                        + edge.getDestination().getId()
                        + ", Вага: " + edge.getWeight() + ") "
                );
            }
            System.out.println();
        }
    }
}