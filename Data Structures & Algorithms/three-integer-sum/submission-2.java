class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();

        int i = 0;
        while (i < nums.length - 2) {
            int j = i + 1, k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum > 0) {
                    k--; 
                } else {
                    j++; 
                }
            }
            i++;
        }
        List<List<Integer>> res = new ArrayList<>(set);
        return res;
    }
}