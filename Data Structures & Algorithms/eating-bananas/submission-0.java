class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxVal = Integer.MIN_VALUE;
        for(int i: piles){
            maxVal = Math.max(i,maxVal);
        }
        int l = 0, r = maxVal, res = 0;
        while(l<=r){
            int m = l + (r-l)/2;
            long timeTaken = 0;
            for(int p : piles){
                timeTaken+=Math.ceil((double)p/m);
            }
            if(timeTaken<=h){
                res = m;
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return res;
    }
}
