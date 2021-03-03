package ru.job4j.algo.graph.bfs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Egor Geraskin(yegeraskin13@gmail.com)
 * @version 1.0
 * @since 12.02.2021
 */
public class Graph {
    private class Vertex {
        List<Integer> relates = new ArrayList<>();
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

    public void addEdge(int firstId, int secondId) {
        vertexes.get(firstId).relates.add(secondId);
        vertexes.get(secondId).relates.add(firstId);
    }

    public List<Integer> getRelates(int vId) {
        return vertexes.get(vId).relates;
    }

    public int getSize() {
        return n;
    }
}
