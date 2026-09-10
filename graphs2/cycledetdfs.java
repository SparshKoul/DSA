package graphs2;

import java.util.ArrayList;

//file 6= cycle detection in undirected graph using dfs

public class cycledetdfs {
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(i, -1, adj, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(int node, int parent,
                         ArrayList<ArrayList<Integer>> adj,
                         boolean[] visited) {

        visited[node] = true;

        for (int neighbor : adj.get(node)) {

            // Not visited -> continue DFS
            if (!visited[neighbor]) {
                if (dfs(neighbor, node, adj, visited)) {
                    return true;
                }
            }

            // Already visited and NOT parent -> cycle
            else if (neighbor != parent) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(3).add(4);
        adj.get(4).add(3);
        // Adding a cycle
        adj.get(4).add(1);
        adj.get(1).add(4);

        cycledetdfs cycleDetector = new cycledetdfs();
        boolean hasCycle = cycleDetector.isCycle(V, adj);

        if (hasCycle) {
            System.out.println("Graph contains a cycle.");
        } else {
            System.out.println("Graph does not contain a cycle.");
        }
        

        
    }
    
}
