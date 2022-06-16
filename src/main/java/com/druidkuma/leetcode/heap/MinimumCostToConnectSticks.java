package com.druidkuma.leetcode.heap;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/**
 * 1167
 *
 * You have some number of sticks with positive integer lengths. These lengths are given as an array sticks, where sticks[i] is the length of the ith stick.
 *
 * You can connect any two sticks of lengths x and y into one stick by paying a cost of x + y. You must connect all the sticks until there is only one stick remaining.
 *
 * Return the minimum cost of connecting all the given sticks into one stick in this way.
 */
public class MinimumCostToConnectSticks {
    public int connectSticks(int[] sticks) {
        int totalCost = 0;
        PriorityQueue<Integer> minHeap = Arrays.stream(sticks).boxed().collect(Collectors.toCollection(PriorityQueue::new));
        while (minHeap.size() > 1) {
            int newStick = minHeap.poll() + minHeap.poll();
            totalCost += newStick;
            minHeap.add(newStick);
        }
        return totalCost;
    }
}
