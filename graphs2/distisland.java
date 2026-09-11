package graphs2;
import java.util.*;

//file 7= count distinct islands in a 2d grid

public class distisland {


     public int countDistinctIslands(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m];

        HashSet<ArrayList<String>> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == 1 && !visited[i][j]) {

                    ArrayList<String> shape = new ArrayList<>();

                    dfs(grid, i, j, i, j, visited, shape);

                    set.add(shape);
                }
            }
        }

        return set.size();
    }

    private void dfs(int[][] grid,
                     int i, int j,
                     int baseI, int baseJ,
                     boolean[][] visited,
                     ArrayList<String> shape) {

        // Out of bounds
        if (i < 0 || i >= grid.length ||
            j < 0 || j >= grid[0].length ||
            grid[i][j] == 0 ||
            visited[i][j]) {
            return;
        }

        visited[i][j] = true;

        // Store relative position
        shape.add((i - baseI) + "," + (j - baseJ));

        // Down
        dfs(grid, i + 1, j, baseI, baseJ, visited, shape);

        // Up
        dfs(grid, i - 1, j, baseI, baseJ, visited, shape);

        // Right
        dfs(grid, i, j + 1, baseI, baseJ, visited, shape);

        // Left
        dfs(grid, i, j - 1, baseI, baseJ, visited, shape);
    }
    

    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 0, 0, 0},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 1, 0},
                {0, 1, 0, 0, 0}
        };
        distisland solution = new distisland();
        int distinctIslandsCount = solution.countDistinctIslands(grid);
        System.out.println("Number of distinct islands: " + distinctIslandsCount);


    }
}
