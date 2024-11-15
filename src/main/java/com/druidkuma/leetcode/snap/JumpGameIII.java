package com.druidkuma.leetcode.snap;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * 1306
 * 
 * Given an array of non-negative integers arr, you are initially positioned at start index of the array. When you are at index i, you can jump to i + arr[i] or i - arr[i], check if you can reach any index with value 0.
 *
 * Notice that you can not jump outside of the array at any time.
 * 
 */
public class JumpGameIII {

    public boolean canReach(int[] arr, int start) {
        Set<Integer> visitedIndexes = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            int nextIndx = queue.poll();
            if (nextIndx < 0 || nextIndx >= arr.length || !visitedIndexes.add(nextIndx)) continue;
            if (arr[nextIndx] == 0) return true;
            queue.add(nextIndx - arr[nextIndx]);
            queue.add(nextIndx + arr[nextIndx]);
        }
        return false;
    }
}
