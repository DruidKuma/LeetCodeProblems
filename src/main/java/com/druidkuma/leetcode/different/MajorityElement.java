package com.druidkuma.leetcode.different;

/**
 * 169
 *
 * Given an array nums of size n, return the majority element.
 *
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) count++;
            else count--;

            if(count <= 0) {
                count = 1;
                candidate = nums[i];
            }
        }
        return candidate;
    }
}
