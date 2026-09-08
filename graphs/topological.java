package graphs;
import java.util.*;
//lecture 9
//topological sort works only on DAG (Directed Acyclic Graph) by dfs

public class topological {

    static class Edge {
        int source;
        int destination;

        public Edge(int source, int destination) {
            this.source = source;
            this.destination = destination;
        }
    }

    public static void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis, Stack<Integer> stack) {
        vis[node] = true; // Mark the current node as visited

        // Traverse all adjacent nodes (neighbors)
        for (int neighbor : adj.get(node)) {
            if (!vis[neighbor]) { // If the neighbor hasn't been visited yet
                dfs(neighbor, adj, vis, stack); // Recursively visit it
            }
        }

        // After visiting all neighbors, push the current node onto the stack
        stack.push(node);
    }

    public static void topologicalSort(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V]; // To track visited nodes
        Stack<Integer> stack = new Stack<>(); // Stack to store the topological order

        // Check each node (in case of disconnected components)
        for (int i = 0; i < V; i++) {
            if (!vis[i]) { // If the node hasn't been visited yet
                dfs(i, adj, vis, stack); // Perform DFS from this node
            }
        }

        // Print the topological order by popping from the stack
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void createGraph(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < 6; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(5).add(0);
        adj.get(5).add(2);
    }
    public static void main(String[] args) {

        int V = 6; // Number of vertices
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);
        createGraph(adj); // Create the directed graph

        System.out.println("Topological Sort of the given graph:");
        topologicalSort(V, adj); // Perform topological sort
        
    }
    
}
