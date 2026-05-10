class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        boolean added = false;
        int[] check = new int[] {newInterval[0], newInterval[1]};
        for (int i = 0; i < intervals.length; i++) {
            int[] a = intervals[i];
            // no overlap with current and check. Add a
            if (a[1] < check[0]) {
                res.add(a);
            }//Major check 
            else if (a[0] > check[1]) {
                if (!added) {
                    res.add(check);
                    added = true;
                }
                res.add(a);
            }else{
                check[0] = Math.min(check[0],a[0]);
                check[1] = Math.max(check[1],a[1]);
            }
        }
        if(!added){
            res.add(check);
        }
        return res.toArray(new int[0][]);
    }
}
