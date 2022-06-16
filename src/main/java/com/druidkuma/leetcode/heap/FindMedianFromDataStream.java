package com.druidkuma.leetcode.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 295
 *
 * The median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value and the median is the mean of the two middle values.
 *
 * For example, for arr = [2,3,4], the median is 3.
 * For example, for arr = [2,3], the median is (2 + 3) / 2 = 2.5.
 * Implement the MedianFinder class:
 *
 * MedianFinder() initializes the MedianFinder object.
 * void addNum(int num) adds the integer num from the data stream to the data structure.
 * double findMedian() returns the median of all elements so far. Answers within 10-5 of the actual answer will be accepted.
 */
public class FindMedianFromDataStream {

    private PriorityQueue<Integer> maxHeap;
    private PriorityQueue<Integer> minHeap;

    public FindMedianFromDataStream() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    }

    public void addNum(int num) {
        maxHeap.add(num);
        minHeap.add(maxHeap.poll());

        if (minHeap.size() > maxHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }

    public double findMedian() {
        return maxHeap.size() > minHeap.size() ? maxHeap.peek() : ((maxHeap.peek() + minHeap.peek())) * 0.5;
    }
}
