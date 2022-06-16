package com.druidkuma.leetcode.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 347
 *
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 */
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Long> countMap = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.comparing(countMap::get));
        for (int num : countMap.keySet()) {
            minHeap.add(num);
            if (minHeap.size() > k) minHeap.poll();
        }

        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll();
        }

        return result;
    }
}
