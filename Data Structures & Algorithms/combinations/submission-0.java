class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if(n==k){
            List<Integer> data = new ArrayList<>();
            for(int i=1; i<=n; i++){
                data.add(i);
            }
            res.add(new ArrayList<>(data));
            return res;
        }
        for(int i=1; i<=n; i++){
            List<Integer> curr = new ArrayList<>();
            curr.add(i);
            find(curr, res, i+1, n, k);
        }
        return res;
    }
    public void find(List<Integer> curr, List<List<Integer>> res, int i, int n, int k){
        if(curr.size()==k || i>n){
            if(curr.size()==k){
                res.add(new ArrayList<>(curr));
            }
            return;
        }
        curr.add(i);
        find(curr, res, i+1, n, k);
        curr.remove(curr.size()-1);
        find(curr, res, i+1, n, k);
    }
}