class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>(
            (a,b)-> Integer.compare(b,a)
        );
        for(int i: nums){
            p.offer(i);
        }
        int res = -1;
        while(k>0){
            res = p.poll();
            k--;
        }
        return res;
    }
}
