package graphs2;

//file 8= count number of islands in a 2d grid

public class island {

    public int numIslands(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1 ) {
                    dfs(grid,  i, j);
                    count++;
                }
            }
        }

        return count;
    }

    private void dfs(int[][] grid,  int row, int col) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (row < 0 || row >= rows || col < 0 || col >= cols || grid[row][col] == 0 ) {
            return;
        }

        grid[row][col] = '0'; // Mark the cell as visited by changing it to '0'

        dfs(grid, row - 1, col); // up
        dfs(grid, row + 1, col); // down
        dfs(grid, row, col - 1); // left
        dfs(grid, row, col + 1); // right
    }

}