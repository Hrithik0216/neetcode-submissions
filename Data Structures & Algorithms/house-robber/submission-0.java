class Solution {
    public int find(Integer[] dp, int[] nums, int start) {
        if (start >= nums.length) {
            return 0;
        }
        if (dp[start] != null) {
            return dp[start];
        }
        dp[start] = Math.max(find(dp, nums, start + 1), nums[start] + find(dp, nums, start + 2));
        return dp[start];
    }
    public int rob(int[] nums) {
        Integer[] dp = new Integer[nums.length + 1];
        return find(dp, nums, 0);
    }
}
