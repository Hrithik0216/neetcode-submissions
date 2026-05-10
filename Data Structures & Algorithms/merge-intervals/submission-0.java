class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
    // Arrays.sort(intervals, (int[] i) -> i[0]);
    Arrays.sort(intervals, Comparator.comparingInt(i->i[0]));
        int[] first = intervals[0];
        List<int[]> res = new ArrayList<>();
        res.add(first);
        for(int[] i: intervals){
            if(i[0]<=first[1]){
                first[1] = Math.max(first[1], i[1]);
            }else{
                first = i;
                res.add(first);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
