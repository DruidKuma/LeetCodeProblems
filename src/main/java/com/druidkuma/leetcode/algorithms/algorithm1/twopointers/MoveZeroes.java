package com.druidkuma.leetcode.algorithms.algorithm1.twopointers;

/**
 * 283
 *
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 */
public class MoveZeroes {

    public int[] moveZerosOptimal(int[] nums) {
        int lastZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[i] = (nums[i] + nums[lastZeroIndex]) - (nums[lastZeroIndex] = nums[i]);
                lastZeroIndex++;
            }
        }
        return nums;
    }

    public int[] moveZeroes(int[] nums) {
        if (nums.length <= 1) return nums;

        int currentIndex = 0;
        int currentZeroReplaceIndex = nums.length - 1;

        while (currentIndex < currentZeroReplaceIndex) {
            if (nums[currentIndex] == 0) {
                moveNumberToIndex(nums, currentIndex, currentZeroReplaceIndex);
                currentZeroReplaceIndex--;
            }
            else {
                currentIndex++;
            }

        }

        return nums;
    }

    private void moveNumberToIndex(int[] nums, int zeroIndex, int targetIndex) {
        int index = zeroIndex;
        while (index < targetIndex) {
            int temp = nums[index];
            nums[index] = nums[index + 1];
            nums[index + 1] = temp;
            index++;
        }
    }
}
