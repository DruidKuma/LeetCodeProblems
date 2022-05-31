package com.druidkuma.leetcode.algorithms.algorithm1.binarysearch;

/**
 * 704
 *
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums.
 * If target exists, then return its index. Otherwise, return -1.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int index = left + (right - left) / 2;
            if (nums[index] == target) return index;
            else if (nums[index] > target) right = index - 1;
            else left = index + 1;
        }

        return -1;
    }
}
