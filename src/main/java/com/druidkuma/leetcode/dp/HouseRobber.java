package com.druidkuma.leetcode.dp;

import java.util.HashMap;
import java.util.Map;

/**
 * 198
 *
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is
 * that adjacent houses have security systems connected and it will automatically contact the police if
 * two adjacent houses were broken into on the same night.
 *
 * Given an integer array nums representing the amount of money of each house,
 * return the maximum amount of money you can rob tonight without alerting the police.
 */
public class HouseRobber {
    public int rob(int[] nums) {
        return solution(nums.length - 1, nums, new HashMap<>());
    }

    private int solution(int i, int[] nums, Map<Integer, Integer> memo) {
        if (i == 0) return nums[0];
        if (i == 1) return Math.max(nums[0], nums[1]);
        if (!memo.containsKey(i)) {
            memo.put(i, Math.max(solution(i - 1, nums, memo), solution(i - 2, nums, memo) + nums[i]));
        }
        return memo.get(i);
    }
}
