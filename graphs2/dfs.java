package graphs2;
import java.util.*;
//second file DFS   =>

    
//Choose starting node.
//Mark it visited.
//Go to an unvisited neighbor.
//Keep going deeper.
//When no unvisited neighbor → backtrack.
//Repeat until done.
//For disconnected graph, start again from an unvisited node.

public class dfs {
    
    public static void dfsTraversal(ArrayList<ArrayList<Integer>> graph, int startVertex, boolean[] visited) {

        visited[startVertex] = true;
        System.out.print(startVertex + " ");

        for (int neighbor : graph.get(startVertex)) {

            if (!visited[neighbor]) {
                dfsTraversal(graph, neighbor, visited);
            }
        }
    }

    public static void dfsDisconnected(ArrayList<ArrayList<Integer>> graph) {

        boolean[] visited = new boolean[graph.size()];

        for (int i = 0; i < graph.size(); i++) {

            if (!visited[i]) {
                dfsTraversal(graph, i, visited);
            }
        }
    }

    public static void createGraph(ArrayList<ArrayList<Integer>> graph) {

        for (int i = 0; i < 7; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(0);
        graph.get(1).add(3);

        graph.get(2).add(0);
        graph.get(2).add(4);

        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);

        graph.get(4).add(2);
        graph.get(4).add(3);
        graph.get(4).add(5);

        graph.get(5).add(3);
        graph.get(5).add(4);
        graph.get(5).add(6);

        graph.get(6).add(5);
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        createGraph(graph);

        System.out.println("DFS Traversal of the graph:");
        dfsDisconnected(graph);
    }
    
}
