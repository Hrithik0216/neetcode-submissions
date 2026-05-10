class Solution {
    public static void findSubsets(int idx, int[] arr, List<List<Integer>> res , List<Integer> sub){
                if(idx==arr.length){
                    res.add(new ArrayList<>(sub));
                    return;
                }
                sub.add(arr[idx]);
                findSubsets(idx+1, arr, res, sub);
                sub.remove(sub.size()-1);
                findSubsets(idx+1, arr, res, sub);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub  = new ArrayList<>();
        findSubsets(0, nums, res, sub);
        return res;
    }
}
