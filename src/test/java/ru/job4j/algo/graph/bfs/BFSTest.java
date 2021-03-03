package ru.job4j.algo.graph.bfs;

import org.junit.Test;
import ru.job4j.algo.graph.dfs.Graph;

import static org.junit.Assert.*;

public class BFSTest {

    @Test
    public void search() {
        ru.job4j.algo.graph.dfs.Graph graph = new Graph(5);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 4);
        BFS bfs = new BFS(graph);
        bfs.search(5);
        for (int i = 1; i <= 5; ++i) {
            assertTrue(bfs.getUsed()[i]);
        }
    }
}