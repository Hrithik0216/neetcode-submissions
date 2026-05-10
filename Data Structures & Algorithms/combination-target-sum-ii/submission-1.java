class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(candidates);
        find(candidates, target, res, curr, set, 0);
        return res;
    }
    public void find(int[] candidates, int target, List<List<Integer>> res, List<Integer> curr,Set<List<Integer>> set, int i){
        if(target==0){
            List<Integer> temp = new ArrayList<>(curr);
            if(!set.contains(curr)){
                set.add(temp);
                res.add(temp);
                return;
            }
        }
        if(i>=candidates.length || target<0){
            return;
        }
        curr.add(candidates[i]);
        find(candidates, target-candidates[i], res, curr, set, i+1);
        curr.remove(curr.size()-1);
        find(candidates, target, res, curr, set, i+1);
    }
}
