package com.druidkuma.leetcode.arraystring;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 747
 *
 * You are given an integer array nums where the largest integer is unique.
 *
 * Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.
 */
public class LargestNumberAtLeastTwiceOfOthers {
    public int dominantIndex(int[] nums) {
        if (nums.length == 1) return 0;
        int maxNumber = Arrays.stream(nums).boxed().max(Comparator.naturalOrder()).get();
        int maxNumIndx = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == maxNumber) maxNumIndx = i;
            if (nums[i] != maxNumber && nums[i] * 2 > maxNumber) return -1;
        }
        return maxNumIndx;
    }
}
