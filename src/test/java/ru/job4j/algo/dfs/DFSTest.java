package ru.job4j.algo.dfs;

import org.junit.Test;

import static org.junit.Assert.*;

public class DFSTest {

    @Test
    public void search() {
        Graph graph = new Graph(5);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 4);
        DFS dfs = new DFS(graph);
        dfs.search(5);
        for (int i = 1; i <= 5; ++i) {
            assertTrue(dfs.getUsed()[i]);
        }
    }
}