package com.druidkuma.leetcode.heap;

import java.util.PriorityQueue;

/**
 * 215
 *
 * Given an integer array nums and an integer k, return the kth largest element in the array.
 *
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 */
public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            if (minHeap.size() >= k) {
                Integer topElement = minHeap.peek();
                if (num > topElement) {
                    minHeap.poll();
                    minHeap.add(num);
                }
            }
            else minHeap.add(num);
        }

        return minHeap.isEmpty() ? 0 : minHeap.poll();
    }
}
