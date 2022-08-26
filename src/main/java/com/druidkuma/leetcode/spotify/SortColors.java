package com.druidkuma.leetcode.spotify;

/**
 * 75
 *
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 *
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 *
 * You must solve this problem without using the library's sort function.
 */
public class SortColors {
    public void sortColors(int[] nums) {
        int start = 0;
        int current = 0;
        int end = nums.length - 1;
        while (current <= end) {
            if (nums[current] == 0) swap(nums, start++, current++);
            else if (nums[current] == 2) swap(nums, current, end--);
            else current++;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
