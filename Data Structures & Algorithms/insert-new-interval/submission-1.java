class Solution {

    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> res = new ArrayList<>();

        boolean added = false;

        int[] first = new int[]{newInterval[0], newInterval[1]};

        for (int i = 0; i < intervals.length; i++) {

            int[] a = intervals[i];

            // completely before
            if (a[1] < first[0]) {

                res.add(a);
            }

            // completely after
            else if (a[0] > first[1]) {

                if (!added) {
                    res.add(first);
                    added = true;
                }

                res.add(a);
            }

            // overlap
            else {

                first[0] = Math.min(a[0], first[0]);
                first[1] = Math.max(a[1], first[1]);
            }
        }

        if (!added) {
            res.add(first);
        }

        return res.toArray(new int[0][]);
    }
}