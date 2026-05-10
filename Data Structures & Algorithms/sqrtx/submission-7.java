class Solution {
    public int mySqrt(int x) {
        int l = 0, r = x, res = 0;
        while(l<=r){
            int m = l+ (r-l)/2;
            long sqr = (long)m*m;
            if(sqr<x){
                res=m;
                l=m+1;
            }else if(sqr>x){
                r = m-1;
            }else{
                return m;
            }
        }
        return res;
    }
}