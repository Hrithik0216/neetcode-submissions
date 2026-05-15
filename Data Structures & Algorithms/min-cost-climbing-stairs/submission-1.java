class Solution {
    public int find(int startIdx, int rate, int[] cost, Integer[][] dp) {
        if (startIdx >= cost.length) {
            return rate;
        }
        if (dp[startIdx][rate] != null) {
            return dp[startIdx][rate];
        }
        int oneStep = find(startIdx + 1, rate + cost[startIdx], cost, dp);
        int twoStep = find(startIdx + 2, rate + cost[startIdx], cost, dp);
        dp[startIdx][rate] = Math.min(oneStep, twoStep);
        return dp[startIdx][rate];
    }
    public int minCostClimbingStairs(int[] cost) {
        int maxCost = 0;
        for (int c : cost) {
            maxCost += c;
        }
        Integer[][] dp = new Integer[cost.length][maxCost + 1];
        return Math.min(find(0, 0, cost, dp), find(1, 0, cost, dp));
    }
}
