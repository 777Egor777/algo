package ru.job4j.algo.graph.djkstra;

import java.util.Arrays;
import java.util.List;

/**
 * @author Egor Geraskin(yegeraskin13@gmail.com)
 * @version 1.0
 * @since 04.03.2021
 */
public final class Djkstra {
    public static final int INF = (int)1e9 + 7;

    private final Graph graph;
    private final int startVertexId;

    private int numOfVertexes;
    private Integer[] d;
    private boolean[] used;
    private boolean isComputed = false;

    public Djkstra(Graph graph, int startVertexId) {
        this.graph = graph;
        this.startVertexId = startVertexId;
    }

    public void init() {
        numOfVertexes = graph.getSize();
        d = new Integer[numOfVertexes + 1];
        for (int i = 0; i <= numOfVertexes; ++i) {
            if (i != startVertexId) {
                d[i] = INF;
            }
        }
        used = new boolean[numOfVertexes + 1];
        d[startVertexId] = 0;
    }

    private int notUsedVertexWithMinD() {
        int v = 0;
        for (int i = 1; i <= numOfVertexes; ++i) {
            if (!used[i] && d[i] < d[v]) {
                v = i;
            }
        }
        return v;
    }

    private void updatePathLengths(int v) {
        for (Edge edge : graph.getRelates(v)) {
            int to = edge.getTo();
            if (!used[to]) {
                int weight = edge.getWeight();
                d[to] = Math.min(d[to], d[v] + weight);
            }
        }
    }

    private void compute() {
        init();
        int v;
        while ( (v = notUsedVertexWithMinD()) != 0) {
            used[v] = true;
            updatePathLengths(v);
        }
        isComputed = true;
    }

    public synchronized List<Integer> getPathLengths() {
        if (!isComputed) {
            compute();
        }
        return Arrays.asList(d);
    }
}
