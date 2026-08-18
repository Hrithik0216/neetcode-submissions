class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int h=i,l=i+1, r=nums.length-1;
            while(l<r){
                int sum = nums[l]+nums[r];
                if(-nums[h]==sum){
                    List<Integer> li = Arrays.asList(nums[h],nums[l],nums[r]);
                    if(!set.contains(li)){
                        set.add(li);
                        res.add(li);
                    }
                    l++; r--;
                }else if(sum>-nums[h]){
                    r--;
                }else{
                    l++;
                }
            }
        }
        return res;
    }
}
