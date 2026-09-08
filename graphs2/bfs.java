package graphs2;
//first file BFS=>
    
//Choose starting node.
//Mark it visited.
//Add it to Queue.
//Remove node from queue.
//Visit all unvisited neighbors → mark + add to queue.
//Repeat until queue is empty.
//For disconnected graph, start again from any unvisited node.

import java.util.*;

public class bfs {

    public static void bfsTraversal(ArrayList<ArrayList<Integer>> graph, int startVertex,boolean[] visited) {

        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {

            int curr = queue.poll();
            System.out.print(curr + " ");

            for (int neighbor : graph.get(curr)) {

                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void bfsDisconnected(ArrayList<ArrayList<Integer>> graph) {

        boolean[] visited = new boolean[graph.size()];

        for (int i = 0; i < graph.size(); i++) {

            if (!visited[i]) {
                bfsTraversal(graph, i, visited);
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

        System.out.println("BFS:");
        bfsDisconnected(graph);
    }
}