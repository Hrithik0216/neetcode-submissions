class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] numArr = new int[nums.length*2];
        for(int i = 0; i<nums.length; i++){
            numArr[i]=nums[i];
            numArr[nums.length+i]=nums[i];
        }
        return numArr;
    }
}