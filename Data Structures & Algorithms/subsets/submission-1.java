class Solution {
    public void backtrack(List<List<Integer>> res, List<Integer> sub, int idx, int[] nums){
        if(idx == nums.length){
            res.add(new ArrayList<>(sub));
            return;
        }
        sub.add(nums[idx]);
        backtrack(res, sub, idx+1, nums);
        sub.remove(sub.size()-1);
        backtrack(res, sub, idx+1, nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        backtrack(res,sub, 0, nums);
        return res;
    }
}
