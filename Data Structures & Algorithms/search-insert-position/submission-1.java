class Solution {
    public int searchInsert(int[] nums, int target) {
        int l =0, h = nums.length-1;
        int res = 0;
        while(l<=h){
            int m = l+ (h-l)/2;
            if(nums[m]==target){
                return m;
            }else if(nums[m]<target){
                
                l = m+1;
                res = l;
            }else{
                h = m-1; 
            }
        }
        return res;
    }
}