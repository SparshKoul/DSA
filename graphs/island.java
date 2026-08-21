package graphs;
//6th file: no of islands in a 2D matrix using DFS and BFS

public class island {
    
    static class Pair{
        int row;
        int col;

        Pair(int row, int col){
            this.row=row;
            this.col=col;
        }
    }
    
    static int countIslandsDFS(int[][] grid){
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }

    static void dfs(int[][] grid,int row,int col){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]==0){
            return;
        }
        grid[row][col]=0; //mark as visited
        dfs(grid,row-1,col); //up
        dfs(grid,row+1,col); //down
        dfs(grid,row,col-1); //left
        dfs(grid,row,col+1); //right
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 1, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 0, 1, 1}
        };

        int numIslands = countIslandsDFS(grid);
        System.out.println("Number of islands: " + numIslands);
    }
    
}
