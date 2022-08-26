package com.druidkuma.leetcode.blind75.array;

/**
 * 152
 *
 * Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.
 *
 * The test cases are generated so that the answer will fit in a 32-bit integer.
 *
 * A subarray is a contiguous subsequence of the array.
 */
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int ltrProduct = 1;
        int rtlProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            ltrProduct *= nums[i];
            rtlProduct *= nums[nums.length - 1 - i];
            max = Math.max(max, Math.max(ltrProduct, rtlProduct));

            if (ltrProduct == 0) ltrProduct = 1;
            if (rtlProduct == 0) rtlProduct = 1;
        }
        return max;
    }
}
