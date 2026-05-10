class Solution {
    public void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void backtrack(int[] nums, int idx, List<List<Integer>> res, HashSet<List<Integer>> set){
        if(idx == nums.length){
            List<Integer> sub = new ArrayList<>();
            for(int k: nums){
                sub.add(k);
            }
            if(!set.contains(sub)){
                set.add(sub);
                res.add(sub);
            }
            return;
        }
        for(int i=idx; i<nums.length; i++){
            swap(i, idx, nums);
            backtrack(nums, idx+1, res, set);
            swap(i, idx, nums);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        backtrack(nums, 0, res, set);
        return res;
    }
}