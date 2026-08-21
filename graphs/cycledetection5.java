package graphs;
//cycle detection in undirected graph using bfs and dfs for undirected graph.
import java.util.*;

public class cycledetection5 {
    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            src = s;
            dest = d;
        }
    }
    static class Pair {
        int node;
        int parent;

        Pair(int v, int p) {
            this.node = v;
            this.parent = p;
        }
    }

      // ========================= DFS =========================

    // dfs for cycle detection in undirected graph

    public static boolean isCyclicDFS(ArrayList<Edge>[] graph, int vertex, boolean[] visited, int parent) {

        visited[vertex] = true;
        System.out.println(vertex + " ");

        // Go to the vertexth index of the graph array, take the ArrayList present
        // there, and find its size.
        // traverse neighbours.
        for (int i = 0; i < graph[vertex].size(); i++) {
            Edge edge = graph[vertex].get(i); // graph[vertex] is an ArrayList of edges, so we get the edge at index i

            if (!visited[edge.dest]) {
                if (isCyclicDFS(graph, edge.dest, visited, vertex)) {
                    return true;
                }
            }
            // if the neighbour is already visited and it is not the parent of the current
            // vertex, then there is a cycle.
            else if (visited[edge.dest] == true && edge.dest != parent) {
            // else if ( edge.dest != parent) {  OR JUST WRITE THIS ITS SAME AS ITS IN ELSEIF COMD SO WHEN IT COMES DOWN TO IT IT HAS REFUSED TO GO TO ABOVE ONE.
                return true;

            }
        }
        return false;

    }

    // to handle disconnected graph, we need to call the dfs for each vertex if it
    // is not visited yet.
    // in main method we will call this method to check if the graph is cyclic or
    // not.
    public static boolean isCyclicDisconnectedGraphDFS(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                if (isCyclicDFS(graph, i, visited, -1)) {
                    return true;
                }
            }
        }
        return false;
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


    //cycle detection in disconnected graph using bfs.
        // ========================= BFS =========================

    public static boolean isCyclicBFS(ArrayList<Edge>[] graph, int startVertex, boolean[] visited) {
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(startVertex, -1));
        visited[startVertex] = true;

        while (!queue.isEmpty()) {
            Pair curr = queue.poll();
            int currNode = curr.node;
            int parentNode = curr.parent;

            for (int i = 0; i < graph[currNode].size(); i++) {
                Edge edge = graph[currNode].get(i);
                int neighbour = edge.dest;

                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    queue.add(new Pair(neighbour, currNode));

                
                } 
                //// Already visited and not the parent
                else if (visited[neighbour] == true && neighbour != parentNode) {
                    return true; // Cycle detected
                }
            }
        }
        return false; // No cycle detected
    }

    //to handle disconnected graph, we need to call the bfs for each vertex if it is not visited yet.
    public static boolean isCyclicDisconnectedGraphBFS(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                if (isCyclicBFS(graph, i, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
    

    public static void main(String[] args) {

        ArrayList<Edge>[] graph = new ArrayList[7];

        createGraph(graph);

        if (isCyclicDisconnectedGraphDFS(graph)) {
            System.out.println("Graph is cyclic acc to DFS");
        } else {
            System.out.println("Graph is not cyclic acc to DFS");
        }

        // For BFS
        if (isCyclicDisconnectedGraphBFS(graph)) {
            System.out.println("Graph is cyclic acc to BFS");
        } else {
            System.out.println("Graph is not cyclic acc to BFS");
        }

    }
}