package com.druidkuma.leetcode.snap.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Interval {
    int start;
    int end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "[" + start + ", " + end + "]";
    }
}

public class MergeIntervals {

    public static List<Interval> mergeIntervals(List<Interval> intervals) {
        if (intervals == null || intervals.size() <= 1) {
            return intervals;
        }

        // Sort intervals by start time
        intervals.sort(Comparator.comparingInt(a -> a.start));

        List<Interval> merged = new ArrayList<>();
        Interval current = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {
            Interval next = intervals.get(i);

            if (current.end >= next.start) { // Overlapping intervals
                // Merge by updating the end time to the max end time
                current.end = Math.max(current.end, next.end);
            } else {
                // No overlap, add the current interval to the result and move to the next
                merged.add(current);
                current = next;
            }
        }
        // Add the last interval
        merged.add(current);

        return merged;
    }

    public static void main(String[] args) {
        List<Interval> intervals = Arrays.asList(
            new Interval(1, 3),
            new Interval(2, 4),
            new Interval(5, 7),
            new Interval(6, 8)
        );

        List<Interval> mergedIntervals = mergeIntervals(intervals);

        System.out.println("Merged Intervals: " + mergedIntervals);
    }
}
