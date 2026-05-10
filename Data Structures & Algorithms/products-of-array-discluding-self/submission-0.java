class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = 1;
        int[] suffix = new int[nums.length];
        suffix[suffix.length-1]=1;
        //Fill prefix arr values
        for(int i=1;i <prefix.length; i++){
            prefix[i] = prefix[i-1]* nums[i-1];
        }
        for(int j = suffix.length-2; j>=0; j--){
            suffix[j] = suffix[j+1] * nums[j+1];
        }
        for(int k = 0; k<nums.length;k++){
            nums[k] = prefix[k] * suffix[k];
        }
        return nums;
    }
}  
