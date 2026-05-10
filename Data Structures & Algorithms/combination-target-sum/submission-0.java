class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        findRes(nums, target, res, curr, 0);
        return res;

    }
    public void findRes(int[] nums, int target, List<List<Integer>> res, List<Integer> curr, int i){
        System.out.println("target: "+ target+". i: "+i);
        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(i>=nums.length || target<0){
            return;
        }
        curr.add(nums[i]);
        findRes(nums, target-nums[i], res, curr, i);
        curr.remove(curr.size()-1);
        findRes(nums, target, res, curr, i+1);
    }
}
