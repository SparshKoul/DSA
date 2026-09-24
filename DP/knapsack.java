package DP;


public class knapsack {


    public  static  int profit(int i,int [] wt, int []value , int c,int [][] dp){

        if(i==wt.length || c==0){
            return 0;
        }
        if(dp[i][c] !=-1){
            return  dp[i][c];
        }
        int skip =profit(i+1, wt, value, c,dp);
        

        if (wt[i] > c) {
            return dp[i][c] =skip;
        }

        int take =value[i] + profit(i+1, wt, value, c-wt[i],dp);
        

        return dp[i][c]=Math.max(take,skip);

    }
    public static void main(String[] args) {
        int value[] = {5,3,9,16};
        int wt[] = {1,2,8,10};
        int c=8;
        int n =wt.length;
        int dp[][] = new int [n][c+1];
        for(int i=0;i<wt.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] =-1;
            }
        }
        
        System.out.println (profit(0,wt, value, c,dp));

        
        
    }

    
}