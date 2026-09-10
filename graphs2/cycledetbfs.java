package graphs2;
import java.util.*;
//file 5= cycle detection in undirected graph using bfs

public class cycledetbfs {

    public static boolean isCycle(int V, int[][] edges) {
        // Create an adjacency list representation of the graph
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[V];

        // Perform BFS for each unvisited vertex
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (bfsDetectCycle(graph, visited, i)) {
                    return true; // Cycle detected
                }
            }
        }

        return false; // No cycle detected
    }
    public static boolean bfsDetectCycle(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int startVertex) {
        Queue<int[]> queue = new LinkedList<>();

        // Store the vertex and its parent in the queue
        queue.add(new int[]{startVertex, -1}); 
        visited[startVertex] = true;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int vertex = curr[0];
            int parent = curr[1];

            for (int neighbor : graph.get(vertex)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(new int[]{neighbor, vertex});
                } else if (neighbor != parent) {
                    return true; // Cycle detected
                }
            }
        }

        return false; // No cycle detected
    }
    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {
                {0, 1},
                {1, 2},
                {2, 0},
                {3, 4}
        };

        boolean hasCycle = isCycle(V, edges);
        if (hasCycle) {
            System.out.println("The graph contains a cycle.");
        } else {
            System.out.println("The graph does not contain a cycle.");
        }
        
    }
    
}
