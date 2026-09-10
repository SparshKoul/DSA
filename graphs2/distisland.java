package graphs2;
import java.util.*;

//file 7= count distinct islands in a 2d grid

public class distisland {
    public int numDistinctIslands(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        Set<String> distinctIslands = new HashSet<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    StringBuilder shape = new StringBuilder();
                    dfs(grid, visited, i, j, shape, "o"); // "o" for origin
                    distinctIslands.add(shape.toString());
                }
            }
        }

        return distinctIslands.size();
    }

    private void dfs(int[][] grid, boolean[][] visited, int row, int col, StringBuilder shape, String direction) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (row < 0 || row >= rows || col < 0 || col >= cols || grid[row][col] == 0 || visited[row][col]) {
            return;
        }

        visited[row][col] = true;
        shape.append(direction);

        dfs(grid, visited, row - 1, col, shape, "u"); // up
        dfs(grid, visited, row + 1, col, shape, "d"); // down
        dfs(grid, visited, row, col - 1, shape, "l"); // left
        dfs(grid, visited, row, col + 1, shape, "r"); // right

        shape.append("b"); // backtrack
    }

    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 0, 0, 0},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 1, 1},
                {0, 1, 0, 0, 0}
        };

        distisland solution = new distisland();
        int distinctIslandsCount = solution.numDistinctIslands(grid);
        System.out.println("Number of distinct islands: " + distinctIslandsCount);
    }
    
}
