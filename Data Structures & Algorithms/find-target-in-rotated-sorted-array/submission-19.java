class Solution {
    public int search(int[] nums, int target) {
        int l = 0, h = nums.length-1;
        while(l<h){
            int m = l +(h-l)/2;
            if(nums[m]>nums[h]){
                l=m+1;
            }else{
                h=m;
            }
        }
        int pivot = l;
        //Do binary search in both ends
        l = 0; h = nums.length-1;
        int val = binarySearch(l, pivot-1,nums, target);
        if(val!=-1){
            return val;
        }
        return binarySearch(pivot, h,nums, target);
    }

    private int binarySearch(int l, int h, int[]arr, int target){
        while(l<=h){
            int m = l + (h-l)/2;
            if(arr[m]==target){
                return m;
            }else if(arr[m]>target){
                h=m-1;
            }else{
                l=m+1;
            }
        }
        return -1;
    }
}
