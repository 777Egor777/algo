package ru.job4j.algo.graph.djkstra;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DjkstraTest {

    @Test
    public void getPathLengths() {
        Graph graph = new Graph(5);
        graph.addEdge(1, 2, 3);
        graph.addEdge(1, 3, 8);
        graph.addEdge(1, 5, 20);
        graph.addEdge(2, 3, 10);
        graph.addEdge(3, 4, 1);
        graph.addEdge(3, 5, 14);
        Djkstra djkstra = new Djkstra(graph, 2);
        assertThat(djkstra.getPathLengths(),
                is(List.of(
                        Djkstra.INF,
                        3,
                        0,
                        10,
                        11,
                        23
                )));
    }
}