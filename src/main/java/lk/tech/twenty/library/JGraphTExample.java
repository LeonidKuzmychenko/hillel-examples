package lk.tech.twenty.library;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedWeightedGraph;
import org.jgrapht.graph.DefaultWeightedEdge;

public class JGraphTExample {
    public static void main(String[] args) {

        Graph<Integer, DefaultWeightedEdge> graph =
                new DefaultDirectedWeightedGraph<>(DefaultWeightedEdge.class);

        for (int i = 0; i < 7; i++) {
            graph.addVertex(i);
        }

        DefaultWeightedEdge e1 = graph.addEdge(0, 1);
        graph.setEdgeWeight(e1, 5);

        DefaultWeightedEdge e2 = graph.addEdge(0, 2);
        graph.setEdgeWeight(e2, 3);

        DefaultWeightedEdge e3 = graph.addEdge(1, 3);
        graph.setEdgeWeight(e3, 6);

        DefaultWeightedEdge e4 = graph.addEdge(1, 4);
        graph.setEdgeWeight(e4, 7);

        DefaultWeightedEdge e5 = graph.addEdge(2, 5);
        graph.setEdgeWeight(e5, 9);

        DefaultWeightedEdge e6 = graph.addEdge(3, 6);
        graph.setEdgeWeight(e6, 2);

        DefaultWeightedEdge e7 = graph.addEdge(4, 6);
        graph.setEdgeWeight(e7, 1);

        DefaultWeightedEdge e8 = graph.addEdge(5, 6);
        graph.setEdgeWeight(e8, 4);

        System.out.println(graph);
    }
}