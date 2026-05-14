class Solution {
    public int find(int c, int n, int[][] dp) {
        if (c > n) {
            return 0;
        }
        if (c == n) {
            return 1;
        }
        System.out.println("c: " + c + ", n:" + n);
        if (dp[c][n] != -1) {
            return dp[c][n];
        }
        int f = find(c + 1, n, dp);
        int s = find(c + 2, n, dp);
        dp[c][n] = f + s;
        return f + s;
    }
    public int climbStairs(int n) {
        int[][] dp = new int[n+2][n+1];
        for (int i = 0; i < n+2; i++) {
            for (int j = 0; j < n+1; j++) {
                dp[i][j] = -1;
            }
        }
        return find(0, n, dp);
    }
}
