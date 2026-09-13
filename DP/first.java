package DP;

public class first {
    // 1. Pure Recursion
    public static int fibRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    // 2. Dynamic Programming
    public static int fibDP(int n) {
        if (n <= 1) {
            return n;
        }
        
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10; // Example input
        System.out.println("Fibonacci using recursion: " + fibRecursive(n));
        System.out.println("Fibonacci using dynamic programming: " + fibDP(n));
    }
    
}
