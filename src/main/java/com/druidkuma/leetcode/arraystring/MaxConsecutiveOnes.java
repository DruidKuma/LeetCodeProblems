package com.druidkuma.leetcode.arraystring;

/**
 * 485
 *
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int curOnes = 0;
        for (int num : nums) {
            if (num == 1) curOnes++;
            else {
                maxOnes = Math.max(maxOnes, curOnes);
                curOnes = 0;
            }
        }
        return Math.max(maxOnes, curOnes);
    }
}
