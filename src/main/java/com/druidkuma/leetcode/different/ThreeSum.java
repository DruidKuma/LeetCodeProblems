package com.druidkuma.leetcode.different;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * 15
 *
 * Given an integer array nums, return all the triplets
 * [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * Notice that the solution set must not contain duplicate triplets.
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) return Collections.emptyList();

        Arrays.sort(nums);
        Set<List<Integer>> result = new LinkedHashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int first = nums[i];

            int remainder = -first;
            int firstPointer = i + 1;
            int secondPointer = nums.length - 1;
            while (firstPointer < secondPointer) {
                int sum = nums[firstPointer] + nums[secondPointer];
                if (sum > remainder) {
                    secondPointer--;
                }
                else if (sum < remainder) {
                    firstPointer++;
                }
                else {
                    result.add(Arrays.asList(first, nums[firstPointer], nums[secondPointer--]));
                }
            }
        }

        return new ArrayList<>(result);
    }
}
