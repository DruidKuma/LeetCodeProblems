package com.druidkuma.leetcode.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/**
 * 1046
 *
 * You are given an array of integers stones where stones[i] is the weight of the ith stone.
 *
 * We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:
 *
 * If x == y, both stones are destroyed, and
 * If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
 * At the end of the game, there is at most one stone left.
 *
 * Return the smallest possible weight of the left stone. If there are no stones left, return 0.
 */
public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.addAll(Arrays.stream(stones).boxed().collect(Collectors.toList()));

        while (maxHeap.size() > 1) {
            int y = maxHeap.poll();
            int x = maxHeap.poll();

            int smash = y - x;
            if (smash > 0) {
                maxHeap.add(smash);
            }
        }

        return maxHeap.size() > 0 ? maxHeap.poll() : 0;
    }
}
