package DP;


public class knapsack {

    public  static  int profit(int i,int [] wt, int []value , int c){

        if(i==wt.length || c==0){
            return 0;
        }
        int skip =profit(i+1, wt, value, c);
        

        if (wt[i] > c) {
            return skip;
        }

        int take =value[i] + profit(i+1, wt, value, c-wt[i]);
        

        return Math.max(take,skip);

    }
    public static void main(String[] args) {
        int value[] = {5,3,9,16};
        int wt[] = {1,2,8,10};
        int c=8;
        System.out.println (profit(0,wt, value, c));

        
        
    }

    
}