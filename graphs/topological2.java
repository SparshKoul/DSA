package graphs;
import java.util.*;

//topological sort works only on DAG (Directed Acyclic Graph) by dfs
//kahn's algorithm for topological sort using bfs
//Find nodes with indegree 0 → put them in a queue → remove their edges → repeat the process until all nodes are processed. If at any point, there are no nodes with indegree 0 and not all nodes are processed, then the graph has a cycle.



//1. Calculate indegree
//2. Put indegree-0 nodes in Queue
//3. Remove edges and decrease indegree
//4. When indegree becomes 0 → add to Queue

public class topological2 {

    static class Edge {
        int source;
        int destination;

        public Edge(int source, int destination) {
            this.source = source;
            this.destination = destination;
        }
    }

    public static void topologicalSort(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] indegree = new int[V]; // Array to store indegree of each node

        // Step 1: Calculate indegree of each node
        for (int i = 0; i < V; i++) {
            for (int neighbor : adj.get(i)) {
                indegree[neighbor]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>(); // Queue to store nodes with indegree 0

        // Step 2: Add all nodes with indegree 0 to the queue
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        // Step 3: Process nodes in the queue
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " "); // Print the node in topological order

            // Decrease indegree of all neighbors and add them to the queue if their indegree becomes 0
            for (int neighbor : adj.get(node)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
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