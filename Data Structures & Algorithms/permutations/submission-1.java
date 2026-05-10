class Solution {
    public void swap(int idx, int i, int[] arr){
        int temp = arr[idx];
        arr[idx] = arr[i];
        arr[i] = temp;
    }
    public void loopAndAdd(List<List<Integer>> res, int[] nums, int idx, HashSet<List<Integer>> set){
        if(idx==nums.length){
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
            swap(idx, i, nums);
            loopAndAdd(res, nums, idx+1, set);
            swap(idx, i, nums);
        }
        loopAndAdd(res, nums, idx+1, set);
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        loopAndAdd(res, nums, 0, set);
        return res;
    }
}
