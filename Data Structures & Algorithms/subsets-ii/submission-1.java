class Solution {
    public void backtrack( List<List<Integer>> res, List<Integer> sub, Set<List<Integer>> set, int i, int[] arr){
        if(i==arr.length){
            if(!set.contains(sub)){
                set.add(sub);
                res.add(new ArrayList<>(sub));
            }
            return;
        }
        sub.add(arr[i]);
        backtrack(res, sub, set, i+1, arr);
        sub.remove(sub.size()-1);
        backtrack(res, sub, set, i+1, arr);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        backtrack(res, sub, set, 0, nums);
        return res;
    }
}
