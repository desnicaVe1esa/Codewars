package intervals;

import java.util.Arrays;
import java.util.Comparator;

// Выводит сумму интервалов
public class Interval {
    public static int sumIntervals(int[][] intervals) {
        if (intervals == null || intervals.length < 1) {
            return 0;
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int result = 0;
        int currentIntervalEnd = intervals[0][0];

        for (int[] interval : intervals) {
            int intervalStart = interval[0];
            int intervalEnd = interval[1];
            if (intervalEnd > currentIntervalEnd) {
                result += intervalEnd - Math.max(intervalStart, currentIntervalEnd);
                currentIntervalEnd = intervalEnd;
            }
        }
        return result;
    }
}
