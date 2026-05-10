class Solution {
    public static boolean canShip(int[] arr, int days, int cap){
        int daysCount = 1, sum = 0;
        for(int w: arr){
            if(sum + w>cap){
                sum=0;
                daysCount++;
            }
            sum+=w;
        }
        return daysCount<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int maxWeight = Integer.MIN_VALUE, total=0;
        for(int w: weights){
            maxWeight=Math.max(w,maxWeight);
            total+=w;
        }
        int l = maxWeight, r=total, res = total;
        while(l<=r){
            int m = l+ (r-l)/2;
            if(canShip(weights, days, m)){
                res = m;
                r= m-1;
            }else{
                l=m+1;
            }
        }
        return res;
    }
}