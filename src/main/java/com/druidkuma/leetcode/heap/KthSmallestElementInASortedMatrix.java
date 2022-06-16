package com.druidkuma.leetcode.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 378
 *
 * Given an n x n matrix where each of the rows and columns is sorted in ascending order, return the kth smallest element in the matrix.
 *
 * Note that it is the kth smallest element in the sorted order, not the kth distinct element.
 *
 * You must find a solution with a memory complexity better than O(n2).
 */
public class KthSmallestElementInASortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int[] row : matrix) {
            for (int element : row) {
                if (maxHeap.size() >= k) {
                    if (maxHeap.peek() > element) {
                        maxHeap.poll();
                        maxHeap.add(element);
                    }
                }
                else {
                    maxHeap.add(element);
                }
            }
        }
        return maxHeap.poll();
    }
}
