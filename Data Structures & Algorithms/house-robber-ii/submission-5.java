class Solution {
    public int find(int currIdx, int[] arr, Integer[] dp) {
        if (currIdx >= arr.length) {
            return 0;
        }
        if (dp[currIdx] != null) {
            return dp[currIdx];
        }
        dp[currIdx] =
            Math.max(arr[currIdx] + find(currIdx + 2, arr, dp), find(currIdx + 1, arr, dp));
        return dp[currIdx];
    }
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int[] a1 = new int[nums.length - 1];
        int[] a2 = new int[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            a1[i] = nums[i];
        }
        for (int i = 1; i < nums.length; i++) {
            a2[i - 1] = nums[i];
        }
        Integer[] dp1 = new Integer[a1.length + 1];
        Integer[] dp2 = new Integer[a1.length + 1];
        int takeFirst = find(0, a1, dp1);
        int takeLast = find(0, a2, dp2);
        return Math.max(takeFirst, takeLast);
    }
}
