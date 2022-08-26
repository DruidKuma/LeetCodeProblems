package com.druidkuma.leetcode.blind75.binary;

/**
 * 268
 *
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int expectedSum = nums.length * (nums.length + 1) / 2;
        for (int num : nums) {
            expectedSum -= num;
        }
        return expectedSum;
    }
}
