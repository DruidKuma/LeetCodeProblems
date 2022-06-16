package com.druidkuma.leetcode.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 703
 *
 * Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order, not the kth distinct element.
 *
 * Implement KthLargest class:
 *
 * KthLargest(int k, int[] nums) Initializes the object with the integer k and the stream of integers nums.
 * int add(int val) Appends the integer val to the stream and returns the element representing the kth largest element in the stream.
 */
public class KthLargestElementInAStream {

    private final int k;
    private final PriorityQueue<Integer> heap;

    public KthLargestElementInAStream(int k, int[] nums) {
        this.k = k;
        this.heap = new PriorityQueue<>();
        Arrays.stream(nums).boxed().forEach(this::add);
    }

    public int add(int val) {
        if (heap.size() < k) heap.add(val);
        else if (heap.size() >= k && heap.peek() < val) {
            heap.poll();
            heap.add(val);
        }
        return heap.peek();
    }
}
