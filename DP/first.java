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
    //friends pairing problem
    //recursive solution
    public static int countWaysToPairFriendsRecursive(int n) {
        if (n <= 2) {
            return n;
        }
        return countWaysToPairFriendsRecursive(n - 1) + (n - 1) * countWaysToPairFriendsRecursive(n - 2);
    }

    //dynamic programming solutionusing memo
    public static int countWaysToPairFriendsMemo(int n, int[] memo) {
        if (n <= 2) {
            return n;
        }
        if (memo[n] != -1) {
            return memo[n];
        }
        memo[n] = countWaysToPairFriendsMemo(n - 1, memo) + (n - 1) * countWaysToPairFriendsMemo(n - 2, memo);
        return memo[n];
    }

    //dynamic programming solution using tabulation
    public static int countWaysToPairFriends(int n) {
        if (n <= 2) {
            return n;
        }
        
        int[] dp = new int[n + 1];
        dp[0] = 1; // 1 way to pair 0 friends (do nothing)
        dp[1] = 1; // 1 way to pair 1 friend (do nothing)
        dp[2] = 2; // 2 ways to pair 2 friends (pair them or leave them single)
        
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + (i - 1) * dp[i - 2];
        }
        
        return dp[n];
    }




    //count derangements
    //through recursion
    public static int countDerangementsRecursive(int n) {
        if (n == 0) {
            return 1; // Base case: D(0) = 1
        }
        if (n == 1) {
            return 0; // Base case: D(1) = 0
        }
        return (n - 1) * (countDerangementsRecursive(n - 1)
                + countDerangementsRecursive(n - 2));
    }   

    //dynamic programming solution using memoization
    public static int countDerangementsMemo(int n, int[] memo) {
        if (n == 0) {
            return 1; // Base case: D(0) = 1
        }
        if (n == 1) {
            return 0; // Base case: D(1) = 0
        }
        if (memo[n] != -1) {
            return memo[n];
        }
        memo[n] = (n - 1) * (countDerangementsMemo(n -
    1, memo) + countDerangementsMemo(n - 2, memo));
        return memo[n];
    }

    //dynamic programming solution using tabulation
    public static int countDerangements(int n) {
        if (n == 0) {
            return 1; // Base case: D(0) = 1
        }
        if (n == 1) {
            return 0; // Base case: D(1) = 0
        }

        int[] dp = new int[n + 1];
        dp[0] = 1; // D(0) = 1
        dp[1] = 0; // D(1) = 0

        for (int i = 2; i <= n; i++) {
            dp[i] = (i - 1) * (dp[i - 1] + dp[i - 2]);
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10; // Example input
        System.out.println("Fibonacci using recursion: " + fibRecursive(n));
        System.out.println("Fibonacci using dynamic programming: " + fibDP(n));

        int friends = 5; // Example input for friends pairing problem
        System.out.println("Ways to pair friends using recursion: " + countWaysToPairFriendsRecursive(friends));
        int[] memo = new int[friends + 1];
        for (int i = 0; i <= friends; i++) {
            memo[i] = -1; // Initialize memoization array with -1
        }
        System.out.println("Ways to pair friends using memoization: " + countWaysToPairFriendsMemo(friends, memo));
        System.out.println("Ways to pair friends using tabulation: " + countWaysToPairFriends(friends));



        int derangements = 5; // Example input for derangements
        System.out.println("Derangements using recursion: " + countDerangementsRecursive(derangements));
        int[] derangementMemo = new int[derangements + 1];
        for (int i = 0; i <= derangements; i++) {
            derangementMemo[i] = -1; // Initialize memoization array with -1
        }
        System.out.println("Derangements using memoization: " + countDerangementsMemo(derangements, derangementMemo));
        System.out.println("Derangements using tabulation: " + countDerangements(derangements));
    }
    
}
