package graphs;
import java.util.*;



public class first {
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
        //this above loop creates an empty arraylist at each index of the graph array, so that we can add edges to it later.

        // adding edges to the graph
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));


        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
        // The graph looks like this:
        //   0
        //   |
        //   2
        //  / \
        // 1---3

        // 0 --> {0,2}
        // 1 --> {1,2},{1, 3}
        // 2 --> {2,0},{2,1},{2,3}
        // 3 --> {3,1},{3,2}
       
    }

    public static ArrayList<Edge> getneighbors(ArrayList<Edge>[] graph, int vertex) {
        ArrayList<Edge> neighbors = new ArrayList<>();
        for (Edge edge : graph[vertex]) {
            neighbors.add(edge);
        }
        ////or 
        // for(int i=0;i<graph[vertex].size();i++){
        /// edge e = graph[vertex].get(i);
        /// neighbors.add(e);
        ///}
        
        return neighbors;
    }

    //for only destination of edges we can use below method
    public static ArrayList<Integer> getDestinations(ArrayList<Edge>[] graph, int vertex)
    {
        ArrayList<Integer> destinations = new ArrayList<>();
        for (Edge edge : graph[vertex]) {
            destinations.add(edge.dest);
        }
        return destinations;
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 4;// Number of vertices

        ///// Create an array of 5 ArrayLists

        ArrayList<Edge>[] graph = new ArrayList[V];
        /////ArrayList<Integer> arr = new ArrayList<>(); usung this we can create arraylist of integers.
        /// int arr[] = new int[5];  using this we can create array of integers.

        //graph named array , at which index we have to create arraylist , in arralist there are edges of that vertex..



        createGraph(graph);

        ArrayList<Edge> neighbors = getneighbors(graph, 2);
        System.out.println("Neighbors of vertex 2: " + neighbors);


        ArrayList<Integer> destinations = getDestinations(graph, 2);
        System.out.println("Destinations of vertex 2: " + destinations);

        


    }

    
}
