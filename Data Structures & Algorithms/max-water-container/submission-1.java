class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1;
        int res = Integer.MIN_VALUE;
        while (l < r) {
            res = Math.max(res, Math.abs(l - r) * Math.min(heights[l],heights[r]));
            if (heights[l] <= heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        return res;
    }
}
