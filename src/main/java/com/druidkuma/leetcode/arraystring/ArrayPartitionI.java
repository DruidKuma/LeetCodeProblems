package com.druidkuma.leetcode.arraystring;

import java.util.Arrays;

/**
 * 561
 *
 * Given an integer array nums of 2n integers, group these integers
 * into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is maximized.
 * Return the maximized sum.
 */
public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int first = 0;
        int second = 1;
        int sum = 0;
        while (second < nums.length && first < nums.length) {
            sum += Math.min(nums[first], nums[second]);
            first += 2;
            second += 2;
        }
        return sum;
    }
}
