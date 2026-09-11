package graphs2;
//for file 8= check if a graph is bipartite using dfs

//unvisited nodes are colored with 0, red with 1, and blue with 2. The dfs function colors the current node and recursively colors its neighbors with the opposite color. If a neighbor is already colored with the same color as the current node, the graph is not bipartite.
public class bipartitedfs {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];

        for (int i = 0; i < n; i++) {
            if (color[i] == 0) {
                //here 1-> c is the color of the current node, we can start with any color, here we start with 1.
                if (!dfs(graph, i, color, 1)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean dfs(int[][] graph, int node, int[] color, int c) {
        color[node] = c;

        for (int neighbor : graph[node]) {
            if (color[neighbor] == 0) {
                if (!dfs(graph, neighbor, color, 3 - c)) {
                    return false;
                }
            } else if (color[neighbor] == c) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        bipartitedfs obj = new bipartitedfs();
        int[][] graph1 = {{1, 3}, {0, 2}, {1, 3}, {0, 2}};
        System.out.println(obj.isBipartite(graph1)); // Output: true

        int[][] graph2 = {{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}};
        System.out.println(obj.isBipartite(graph2)); // Output: false
    }
    
}
