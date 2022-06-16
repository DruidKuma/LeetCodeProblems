package com.druidkuma.leetcode.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 253
 *
 * Given an array of meeting time intervals intervals where intervals[i] = [starti, endi], return the minimum number of conference rooms required.
 */
public class MeetingRoomsII {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        PriorityQueue<int[]> heap = new PriorityQueue<>(Comparator.comparing(o -> o[1]));
        for (int[] interval : intervals) {
            if (!heap.isEmpty() && heap.peek()[1] <= interval[0]) {
                heap.poll();
            }
            heap.add(interval);
        }
        return heap.size();
    }
}
