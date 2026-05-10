class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 1) {
            return 0;
        }
        int res = 0;
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        int[] first = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < first[1]) {
                res++;
                if (first[1] > intervals[i][1]) {
                    first = intervals[i];
                }
            } else {
                first = intervals[i];
            }
        }
        return res;
    }
}
