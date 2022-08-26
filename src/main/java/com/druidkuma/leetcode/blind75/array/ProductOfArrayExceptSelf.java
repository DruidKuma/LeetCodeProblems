package com.druidkuma.leetcode.blind75.array;

/**
 * 238
 *
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 *
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 *
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            leftProduct[i] = i == 0 ? nums[i] : leftProduct[i-1] * nums[i];
            rightProduct[nums.length - 1 - i] = i == 0 ? nums[nums.length - 1 - i] : rightProduct[nums.length - i] * nums[nums.length - 1 - i];
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int left = i == 0 ? 1 : leftProduct[i-1];
            int right = i == nums.length - 1 ? 1 : rightProduct[i+1];
            result[i] = left * right;
        }
        return result;
    }
}
