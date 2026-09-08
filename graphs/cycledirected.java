package graphs;
//cycle detection in directed graph using dfs for directed graph.

import java.util.*;

public class cycledirected {
    static class Edge {
        int source;
        int destination;

        public Edge(int source, int destination) {
            this.source = source;
            this.destination = destination;
        }
    }

    private boolean isCycleDFS(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis, boolean[] pathVis) {
        // Mark the current node as visited globally and in the current path
        vis[node] = true;
        pathVis[node] = true;

        // Traverse all adjacent nodes (neighbors)
        for (int neighbor : adj.get(node)) {
            // Case 1: If neighbor is not visited, recursively visit it
            if (!vis[neighbor]) {
                if (isCycleDFS(neighbor, adj, vis, pathVis)) {
                    return true; // Cycle found in the deeper path
                }
            } 
            // Case 2: If the neighbor is already visited AND is on the current path
            else if (pathVis[neighbor]) {
                return true; // Back Edge detected -> Cycle exists
            }
        }

        // Backtrack: Remove the current node from the active path before returning
        pathVis[node] = false;
        return false;
    }


    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V]; // To track visited nodes globally
        boolean[] pathVis = new boolean[V]; // To track nodes in the current DFS path

        // Check each node (in case of disconnected components)
        for (int i = 0; i < V; i++) {
            if (!vis[i]) { // If the node hasn't been visited yet
                if (isCycleDFS(i, adj, vis, pathVis)) {
                    return true; // Cycle detected
                }
            }
        }
        return false; // No cycle detected in any component
    }



    public static void createGraph(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            adj.add(new ArrayList<>());
        }

        // Adding edges to the directed graph
        adj.get(0).add(1);
        adj.get(0).add(2);

        adj.get(1).add(2);

        adj.get(2).add(0);
        adj.get(2).add(3);

        adj.get(3).add(3);
    }

    

    public static void main(String[] args) {
        
        int V = 4; // Number of vertices
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);
        createGraph(adj);

        cycledirected graph = new cycledirected();
        boolean hasCycle = graph.isCyclic(V, adj);

        if (hasCycle) {
            System.out.println("The directed graph contains a cycle.");
        } else {
            System.out.println("The directed graph does not contain a cycle.");
        }


        
    }
    
    
}
