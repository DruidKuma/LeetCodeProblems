package com.druidkuma.leetcode.spotify;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * The median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value. So the median is the mean of the two middle values.
 *
 * For examples, if arr = [2,3,4], the median is 3.
 * For examples, if arr = [1,2,3,4], the median is (2 + 3) / 2 = 2.5.
 * You are given an integer array nums and an integer k. There is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.
 *
 * Return the median array for each window in the original array. Answers within 10-5 of the actual value will be accepted.
 */
public class SlidingWindowMedian {

    public double[] medianSlidingWindow(int[] nums, int k) {
        List<Double> result = new ArrayList<>();
        MedianQueue queue = new MedianQueue();
        for (int i = 0; i< nums.length; i++) {
            queue.offer(nums[i]);
            if (queue.size() >= k) {
                result.add(queue.median());
                queue.remove(nums[i + 1 - k]);
            }
        }
        return result.stream().mapToDouble(i -> i).toArray();
    }

    public double[] medianSlidingWindowBruteForce(int[] nums, int k) {
        List<Double> result = new ArrayList<>();
        int begin = 0;
        while (begin + k <= nums.length) {
            int[] range = Arrays.stream(nums, begin, begin + k).sorted().toArray();
            if (k % 2 == 0) result.add(((long)range[k/2] + range[k/2-1]) / 2d);
            else result.add((double)range[k/2]);
            begin++;
        }
        return result.stream().mapToDouble(i -> i).toArray();
    }

    private class MedianQueue {
        private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        private PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        void offer(int num) {
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());

            if(maxHeap.size() < minHeap.size()) maxHeap.offer(minHeap.poll());
        }

        double median() {
            return maxHeap.size() > minHeap.size() ? maxHeap.peek() : ((long)maxHeap.peek() + minHeap.peek()) * 0.5;
        }

        int size() {
            return minHeap.size() + maxHeap.size();
        }

        boolean remove(int x) {
            return maxHeap.remove(x) || minHeap.remove(x);
        }
    }
}
