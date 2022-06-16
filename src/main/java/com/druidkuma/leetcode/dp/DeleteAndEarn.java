package com.druidkuma.leetcode.dp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 740
 *
 * You are given an integer array nums. You want to maximize the number of points you get by performing the following operation any number of times:
 *
 * Pick any nums[i] and delete it to earn nums[i] points. Afterwards, you must delete every element equal to nums[i] - 1 and every element equal to nums[i] + 1.
 * Return the maximum number of points you can earn by applying the above operation some number of times.
 */
public class DeleteAndEarn {
    public int deleteAndEarn(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Long> counts = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return maxEarnOptimal(counts.keySet().stream().mapToInt(v -> v).max().getAsInt(), counts, new HashMap<>());
    }

    private int maxEarn(int i, int[] nums, Map<Integer, Long> counts) {
        if (i >= nums.length) return 0;

        int currentNumber = nums[i];
        int currentSum = nums[i] * counts.get(nums[i]).intValue();
        i += counts.get(nums[i]);

        if (i >= nums.length) return currentSum;
        if (nums[i] != currentNumber + 1) return currentSum + maxEarn(i, nums, counts);

        int nextIndx = i + counts.get(nums[i]).intValue();
        return Math.max(currentSum + maxEarn(nextIndx, nums, counts), maxEarn(i, nums, counts));
    }

    private int maxEarnOptimal(int num, Map<Integer, Long> counts, Map<Integer, Integer> memo) {
        if (num <= 1) return num * counts.getOrDefault(num, 0L).intValue();

        if (!memo.containsKey(num)) {
            int gain = num * counts.getOrDefault(num, 0L).intValue();
            memo.put(num, Math.max(gain + maxEarnOptimal(num - 2, counts, memo), maxEarnOptimal(num - 1, counts, memo)));
        }

        return memo.get(num);
    }

}
