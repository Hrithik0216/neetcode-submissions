class Solution {
    public int find(int c, int n, int[] dp) {
        if (c > n) {
            return 0;
        }
        if (c == n) {
            return 1;
        }
        System.out.println("c: " + c + ", n:" + n);
        if (dp[c] != -1) {
            return dp[c];
        }
        int f = find(c + 1, n, dp);
        int s = find(c + 2, n, dp);
        dp[c] = f + s;
        return f + s;
    }
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        return find(0, n, dp);
    }
}