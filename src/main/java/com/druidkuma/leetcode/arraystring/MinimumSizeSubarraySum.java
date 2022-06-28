package com.druidkuma.leetcode.arraystring;

/**
 * 209
 *
 * Given an array of positive integers nums and a positive integer target, return the minimal length of
 * a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr] of which the sum is greater than or equal to target.
 * If there is no such subarray, return 0 instead.
 */
public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int begin = 0;
        int curSum = 0;
        int minLen = nums.length + 1;
        for (int i = 0; i < nums.length; i++) {
            curSum += nums[i];
            while (curSum >= target) {
                minLen = Math.min(minLen, i - begin + 1);
                curSum -= nums[begin++];
            }
        }
        return minLen <= nums.length ? minLen : 0;
    }
}
