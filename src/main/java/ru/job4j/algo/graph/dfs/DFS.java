package ru.job4j.algo.graph.dfs;

/**
 * @author Egor Geraskin(yegeraskin13@gmail.com)
 * @version 1.0
 * @since 19.02.2021
 */
public class DFS {
    private final Graph graph;
    private final boolean[] used;

    public DFS(Graph graph) {
        this.graph = graph;
        used = new boolean[graph.getSize() + 1];
        for (int i = 1; i <= graph.getSize(); ++i) {
            used[i] = false;
        }
    }

    public void search() {
        for (int i = 1; i <= graph.getSize(); ++i) {
            if (!used[i]) {
                dfs(i);
            }
        }
    }

    public void search(int v) {
        dfs(v);
    }

    private void dfs(int v) {
        used[v] = true;
        //Main logic of search
        for (int q : graph.getRelates(v)) {
            if (!used[q]) {
                dfs(q);
            }
        }
    }

    public boolean[] getUsed() {
        return used;
    }
}
