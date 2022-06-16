package com.druidkuma.leetcode.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 973
 *
 * Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k, return the k closest points to the origin (0, 0).
 *
 * The distance between two points on the X-Y plane is the Euclidean distance (i.e., √(x1 - x2)2 + (y1 - y2)2).
 *
 * You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).
 */
public class KClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(Comparator.comparing(this::distanceToOrigin).reversed());
        for (int[] point : points) {
            if (maxHeap.size() >= k) {
                if (distanceToOrigin(maxHeap.peek()) > distanceToOrigin(point)) {
                    maxHeap.poll();
                    maxHeap.add(point);
                }
            } else maxHeap.add(point);
        }
        int[][] result = new int[k][2];
        for (int i = k -1 ; i >= 0; i--) {
            result[i] = maxHeap.poll();
        }
        return result;
    }

    private Double distanceToOrigin(int[] point) {
        return Math.sqrt(point[0] * point[0] + point[1] * point[1]);
    }
}
