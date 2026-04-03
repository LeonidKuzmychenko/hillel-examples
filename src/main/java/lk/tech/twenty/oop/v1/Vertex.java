package lk.tech.twenty.oop.v1;

import java.util.ArrayList;
import java.util.List;

// Клас, що представляє вершину графа
public class Vertex {
    private int id;
    private List<Edge> edges;

    Vertex(int id) {
        this.id = id;
        this.edges = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

    // Додавання ребра, яке з'єднує цю вершину з іншою вершиною
    public void addEdge(Vertex destination, int weight) {
        edges.add(new Edge(this, destination, weight));
    }
}