//actual bfs and dfs implementation is in the fourth.java file

package graphs;

import java.util.ArrayList;
import java.util.Queue;
import java .util.*;

public class traversing4 {
    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            src = s;
            dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // adding edges to the graph
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }


    //bfs around a vertex

    public static void bfs(ArrayList<Edge>[] graph, int startVertex) {
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            System.out.print(curr + " ");

            //for (Edge edge : graph[currentVertex]) {
            for(int i = 0; i < graph[curr].size(); i++) {
                Edge edge = graph[curr].get(i);
                
                if (!visited[edge.dest]) {
                    visited[edge.dest] = true;
                    queue.add(edge.dest);
                }
            }
        }

    }

    //bfs around disconnected graph
    //loop through all vertices and call bfs for unvisited vertices as some vertices are not connected .
    public static void bfsDisconnectedGraph(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                bfs(graph, i);
            }
        }
    }



    //dfs around a vertex
    public static void dfs(ArrayList<Edge>[] graph, int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        //for (Edge edge : graph[vertex]) {
        for(int i = 0; i < graph[vertex].size(); i++) {
            Edge edge = graph[vertex].get(i);
            if (!visited[edge.dest]) {
                dfs(graph, edge.dest, visited);
            }
        }
    }

    //dfs around disconnected graph
    //as logic is some vertices are not connected to each other so we need to call dfs for each vertex if it is not visited yet.
    public static void dfsDisconnectedGraph(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                dfs(graph, i, visited);
            }
        }
    }




    //cycle detection in undirected graph using dfs 
    public static boolean isCyclicdfs(ArrayList<Edge>[] graph, int vertex, boolean[] visited, int parent) {
        visited[vertex] = true;

        for (Edge edge : graph[vertex]) {
            if (!visited[edge.dest]) {
                if (isCyclicdfs(graph, edge.dest, visited, vertex)) {
                    return true;
                }
            } else if (edge.dest != parent) {
                return true; // Cycle detected
            }
        }
        return false;
    }





    
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 7; // number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        bfs(graph, 0); // Perform BFS starting from vertex 0

        System.out.println();
        boolean[] visited = new boolean[graph.length];
        dfs(graph, 0, visited); // Perform DFS starting from vertex 0




        // Check for cycles in the graph
        boolean[] visitedForCycle = new boolean[graph.length];
        boolean hasCycle = false;
        for (int i = 0; i < graph.length; i++) {
            if (!visitedForCycle[i]) {
                if (isCyclicdfs(graph, i, visitedForCycle, -1)) {
                    hasCycle = true;
                    break;
                }
            }
        }   

        if (hasCycle) {
            System.out.println("\nThe graph contains a cycle.");
        } else {
            System.out.println("\nThe graph does not contain a cycle.");
        }

        
    }
    
}
