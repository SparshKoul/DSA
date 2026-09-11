package graphs2;
import java.util.*;  

//file 8= check if a graph is bipartite using bfs

//create a color array to store the color of each node (0=uncolored, 1=red, 2=blue)
public class bipartitebfs {
    
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];

        for (int i = 0; i < n; i++) {
            if (color[i] == 0) {
                if (!bfs(graph, i, color)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean bfs(int[][] graph, int start, int[] color) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        color[start] = 1;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int neighbor : graph[node]) {
                if (color[neighbor] == 0) {
                    color[neighbor] = 3-color[node];
                    //3 - AS WE WANT TO ALTERNATE BETWEEN 1 AND 2, 3-1=2, 3-2=1.
                    queue.add(neighbor);
                } else if (color[neighbor] == color[node]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        bipartitebfs obj = new bipartitebfs();
        int[][] graph1 = {{1, 3}, {0, 2}, {1, 3}, {0, 2}};
        System.out.println(obj.isBipartite(graph1)); // Output: true

        int[][] graph2 = {{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}};
        System.out.println(obj.isBipartite(graph2)); // Output: false
    }
    
}
