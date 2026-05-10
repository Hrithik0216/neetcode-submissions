class Solution {
    public int maxArea(int[] heights) {
        int i = 0, j = heights.length-1, maxArea = 0;
        while(i<j){
            int h = Math.min(heights[i],heights[j]);
            int w = j-i;
            int area = h*w;
            maxArea = Math.max(maxArea, area);
            if(heights[i]<heights[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxArea;
    }
}
