/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if (intervals.size() <= 1) {
            return true;
        }
        intervals.sort(Comparator.comparingInt(i -> i.start));
        Interval first = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            int val = intervals.get(i).start;
            if (val < first.end) {
                return false;
            }else{
                first = intervals.get(i);
            }
        }
        return true;
    }
}
