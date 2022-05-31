package com.druidkuma.leetcode.algorithms.algorithm1.binarysearch;

/**
 * 35
 *
 * Given a sorted array of distinct integers and a target value,
 * return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (true) {
            int index = left + (right - left) / 2;
            if (nums[index] == target) return index;
            else if (nums[index] > target) {
                if (index == 0 || nums[index - 1] < target) return index;
                right = index - 1;
            }
            else {
                if (index == nums.length - 1 || nums[index + 1] > target) return index + 1;
                left = index + 1;
            }
        }
    }
}
