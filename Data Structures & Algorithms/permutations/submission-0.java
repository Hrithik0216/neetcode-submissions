// import java.util.stream.Collectors;

class Solution {
    public static void swapAdd(int[] arr, int idx, int currPos){
        int temp = arr[idx];
        arr[idx] = arr[currPos];
        arr[currPos] = temp;
    }

    public static void startPermutation(int idx, int[] arr, 
    List<List<Integer>> res, Set<List<Integer>> set){
        int n = arr.length;
        if (idx == n) {
            List<Integer> sub = Arrays.stream(arr)
                                .boxed()
                                .collect(Collectors.toList());
            if (!set.contains(sub)) {
                res.add(sub);
                set.add(sub);
            }  
            return;
        }
        for (int i = idx; i < n; i++) {
            swapAdd(arr, idx, i);
            startPermutation(idx + 1, arr, res, set);
            swapAdd(arr, idx, i);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        startPermutation(0, nums, res, set);
        return res;
    }
}
