package graphs;
//file7: rotting oranges problem using BFS and DFS
import java.util.*;

public class rottingo {
    class Pair {
        int row;
        int col;

        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public int orangesRotting(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> q = new LinkedList<>();

        int fresh = 0;

        // Add all rotten oranges
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == 2) {
                    q.add(new int[]{i, j});
                }

                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        int minutes = 0;

        while (!q.isEmpty() && fresh > 0) {

            int size = q.size();

            for (int i = 0; i < size; i++) {

                int[] curr = q.poll();

                int r = curr[0];
                int c = curr[1];

                // UP
                if (r - 1 >= 0 && grid[r - 1][c] == 1 ) {
                    grid[r - 1][c] = 2;
                    fresh--;
                    q.add(new int[]{r - 1, c});
                }

                // DOWN
                if (r + 1 < rows && grid[r + 1][c] == 1) {
                    grid[r + 1][c] = 2;
                    fresh--;
                    q.add(new int[]{r + 1, c});
                }

                // LEFT
                if (c - 1 >= 0 && grid[r][c - 1] == 1) {
                    grid[r][c - 1] = 2;
                    fresh--;
                    q.add(new int[]{r, c - 1});
                }

                // RIGHT
                if (c + 1 < cols && grid[r][c + 1] == 1) {
                    grid[r][c + 1] = 2;
                    fresh--;
                    q.add(new int[]{r, c + 1});
                }
            }

            minutes++;
        }

        if (fresh == 0) {
            return minutes;
        }

        return -1;
    }

    public static void main(String[] args) {
        rottingo solution = new rottingo();
        int[][] grid = {{2, 1, 1}, 
                        {1, 1, 0}, 
                        {0, 1, 1}};
        System.out.println(solution.orangesRotting(grid));
    }
}

