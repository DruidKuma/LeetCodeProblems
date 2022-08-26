package com.druidkuma.leetcode.recursion2;

import java.util.Arrays;

/**
 * 912
 *
 * Given an array of integers nums, sort the array in ascending order.
 */
public class SortAnArray {
    public int[] sortArray(int[] nums) {
        if (nums.length == 1) return nums;

        int[] left = sortArray(Arrays.copyOfRange(nums, 0, nums.length / 2));
        int[] right = sortArray(Arrays.copyOfRange(nums, nums.length / 2, nums.length));

        return merge(left, right);
    }

    private int[] merge(int[] first, int[] second) {
        int leftPointer = 0;
        int rightPointer = 0;
        int resultPointer = 0;
        int[] result = new int[first.length + second.length];
        while (leftPointer < first.length && rightPointer < second.length) {
            if (first[leftPointer] <= second[rightPointer]) {
                result[resultPointer++] = first[leftPointer++];
            }
            else {
                result[resultPointer++] = second[rightPointer++];
            }
        }
        while (leftPointer < first.length) {
            result[resultPointer++] = first[leftPointer++];
        }
        while (rightPointer < second.length) {
            result[resultPointer++] = second[rightPointer++];
        }
        return result;
    }
}
