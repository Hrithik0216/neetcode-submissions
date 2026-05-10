class Solution {
    public int getXor(List<Integer> sub){
        int res = 0;
        for(int i: sub){
            System.out.println(i);
            res^=i;
        }
        System.out.println("-------");
        return res;
    }
    public void backtrack(List<Integer> sub, int i, int[] nums, int[] finalRes){
        if(i==nums.length){
            int xor = getXor(sub);
            finalRes[0]+=xor;
            return;
        }
        sub.add(nums[i]);
        backtrack(sub, i+1, nums, finalRes);
        sub.remove(sub.size()-1);
        backtrack(sub, i+1, nums, finalRes);
    }
    public int subsetXORSum(int[] nums) {
        List<Integer> sub = new ArrayList<>();
        int[] finalRes = new int[1];
        finalRes[0] = 0;
        backtrack(sub, 0,nums, finalRes);
        return finalRes[0];

    }
}