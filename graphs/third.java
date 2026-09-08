//
package graphs;
import java.util.*;

public class third {
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


        //    1 ---3
        //|  /     | \
        //| 0      |  5---6
        //|  \     | /
        //|   2 ---4


    }


    public static ArrayList<Edge> getneighbors(ArrayList<Edge>[] graph, int vertex) {
        ArrayList<Edge> neighbors = new ArrayList<>();
        for (Edge edge : graph[vertex]) {
            neighbors.add(edge);
        }
        return neighbors;
    }

    //bfs
     public static void bfs(ArrayList<Edge>[] graph) {

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[graph.length];

        q.add(0); // starting vertex  if we want bfs accorting to 0. other wise  bfs(ArrayList<Edge>[] graph, int x ) then
                    // q.add(x)

        while (!q.isEmpty()) {

            int curr = q.remove();

            if (!visited[curr]) {

                System.out.print(curr + " ");
                visited[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {

                    Edge e = graph[curr].get(i);

                    q.add(e.dest);
                }
            }
        }
    }


    //dfs
    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] visited) {
        System.out.print(curr + " ");
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                dfs(graph, e.dest, visited);
            }
        }
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        
        int V=7; // number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);


        //bfs
        System.out.println("BFS traversal of the graph starting from vertex 0:");
        bfs(graph);
        System.out.println();



        //dfs
        boolean[] visited = new boolean[graph.length];
        System.out.println("DFS traversal of the graph starting from vertex 0:");
        dfs(graph, 0, visited);
        System.out.println();

    }
    
}
