package com.druidkuma.leetcode.different;

import java.util.Arrays;

/**
 * 16
 *
 * Given an integer array nums of length n and an integer target,
 * find three integers in nums such that the sum is closest to target.
 *
 * Return the sum of the three integers.
 *
 * You may assume that each input would have exactly one solution.
 */
public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int currentResult = Integer.MAX_VALUE;
        int currentDeviation = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {
            int first = nums[i];

            int firstPointer = i + 1;
            int secondPointer = nums.length - 1;
            while (firstPointer < secondPointer) {
                int tripletSum = first + nums[firstPointer] + nums[secondPointer];

                int deviation;
                if (target < 0 && tripletSum > 0 || target > 0 && tripletSum < 0) {
                    deviation = Math.abs(target) + Math.abs(tripletSum);
                }
                else {
                    deviation = Math.abs(Math.abs(tripletSum) - Math.abs(target));
                }
                if (deviation < currentDeviation) {
                    currentDeviation = deviation;
                    currentResult = tripletSum;
                }

                if (tripletSum > target) secondPointer--;
                else if (tripletSum < target) firstPointer++;
                else return currentResult;
            }
        }

        return currentResult;
    }
}
