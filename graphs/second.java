package graphs;
import java.util.*;
//if the graph is weighted then we can add weight to the edge class and then we can use that weight in the graph algorithms.

public class second {
    static class Edge {
        int src;
        int dest;
        int weight;

        Edge(int s, int d, int w) {
            src = s;
            dest = d;
            weight = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // adding edges to the graph
        graph[0].add(new Edge(0, 2, 2));


        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 1, 10));
        graph[2].add(new Edge(2, 3, 1));

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2, -1));
        // The graph looks like this:
        //      0
        //      |(2)
        //      2
        //  (10)/ \(1)
        //     1---3
        //      (0)  

    }

    public static void getneighbors( ArrayList<Edge>[] graph, int vertex) {
        for (Edge edge : graph[vertex]) {
            System.out.println(edge.dest + " (weight: " + edge.weight + ")");
        }
    }
    public static void main(String[] args) {
        
        int V = 4; // number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);


        // Print the neighbors of each vertex
        for (int i = 0; i < V; i++) {
            System.out.println("Neighbors of vertex " + i + ": ");
            getneighbors(graph, i);
        }

        //for specific vertex neighbors we can use below method
        int vertex = 2;
        System.out.println("Neighbors of specific vertex " + vertex + ": ");
        getneighbors(graph, vertex);

    }
    
}
