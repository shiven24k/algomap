import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];

        // Sort intervals based on start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (end >= intervals[i][0]) {  // Merge overlapping intervals
                end = Math.max(end, intervals[i][1]);
            } else {  // No overlap, add the merged interval and reset start, end
                merged.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        // Add last merged interval
        merged.add(new int[]{start, end});

        return merged.toArray(new int[merged.size()][]);
    }
}
