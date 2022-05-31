package com.druidkuma.leetcode.algorithms.algorithm1.twopointers;

/**
 * 189
 *
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 */
public class RotateArray {
    public int[] rotate(int[] nums, int k) {
        int[] result = new int[nums.length];
        k = k % nums.length;

        for (int i = 0; i < nums.length; i++) {
            result[(i + k) % nums.length] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
        }
        return nums;
    }
}
