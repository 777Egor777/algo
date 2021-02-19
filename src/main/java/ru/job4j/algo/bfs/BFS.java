package ru.job4j.algo.bfs;

import ru.job4j.algo.dfs.Graph;

/**
 * @author Egor Geraskin(yegeraskin13@gmail.com)
 * @version 1.0
 * @since 19.02.2021
 */
public class BFS {
    private final ru.job4j.algo.dfs.Graph graph;
    private final boolean[] used;

    public BFS(Graph graph) {
        this.graph = graph;
        used = new boolean[graph.getSize() + 1];
        for (int i = 1; i <= graph.getSize(); ++i) {
            used[i] = false;
        }
    }

    public boolean[] getUsed() {
        return used;
    }

    public void search() {
        for (int i = 1; i <= graph.getSize(); ++i) {
            if (!used[i]) {
                bfs(i);
            }
        }
    }

    public void search(int v) {
        bfs(v);
    }

    private void bfs(int v) {

    }
}
