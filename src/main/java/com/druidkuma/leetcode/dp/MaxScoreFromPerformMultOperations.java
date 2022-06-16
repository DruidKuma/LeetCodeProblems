package com.druidkuma.leetcode.dp;

/**
 * 1770
 *
 * You are given two integer arrays nums and multipliers of size n and m respectively, where n >= m. The arrays are 1-indexed.
 *
 * You begin with a score of 0. You want to perform exactly m operations. On the ith operation (1-indexed), you will:
 *
 * Choose one integer x from either the start or the end of the array nums.
 * Add multipliers[i] * x to your score.
 * Remove x from the array nums.
 * Return the maximum score after performing m operations.
 */
public class MaxScoreFromPerformMultOperations {

    public int maximumScore(int[] nums, int[] multipliers) {
        return maxScore(0, 0, nums, multipliers, new int[multipliers.length][multipliers.length]);
    }

    private int maxScore(int start, int multIndx, int[] nums, int[] multipliers, int[][] memo) {
        if (multIndx >= multipliers.length) return 0;

        int end = nums.length - 1 - (multIndx - start);
        int gainStart = nums[start] * multipliers[multIndx];
        int gainEnd = nums[end] * multipliers[multIndx];

        if(memo[multIndx][start] == 0) {
            memo[multIndx][start] = Math.max(
                    gainStart + maxScore(start + 1, multIndx + 1, nums, multipliers, memo),
                    gainEnd + maxScore(start, multIndx + 1, nums, multipliers, memo)
            );
        }

        return memo[multIndx][start];
    }
}
