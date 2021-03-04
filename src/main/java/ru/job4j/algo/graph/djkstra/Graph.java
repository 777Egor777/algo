package ru.job4j.algo.graph.djkstra;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Egor Geraskin(yegeraskin13@gmail.com)
 * @version 1.0
 * @since 04.03.2021
 */
public class Graph {

    private static class Vertex {
        List<Edge> relates = new ArrayList<>();
    }

    //Num of vertexes in graph
    private final int n;
    private final List<Vertex> vertexes;

    public Graph(int n) {
        this.n = n;
        vertexes = new ArrayList<>();
        for (int i = 0; i <= n; ++i) {
            vertexes.add(new Vertex());
        }
    }

    public void addEdge(int firstId, int secondId, int weight) {
        vertexes.get(firstId).relates.add(new Edge(secondId, weight));
        vertexes.get(secondId).relates.add(new Edge(firstId, weight));
    }

    public List<Edge> getRelates(int vId) {
        return vertexes.get(vId).relates;
    }

    public int getSize() {
        return n;
    }
}
