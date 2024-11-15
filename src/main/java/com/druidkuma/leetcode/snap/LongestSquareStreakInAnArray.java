package com.druidkuma.leetcode.snap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 2501
 * 
 * 
 * You are given an integer array nums. A subsequence of nums is called a square streak if:
 *
 * The length of the subsequence is at least 2, and
 * after sorting the subsequence, each element (except the first element) is the square of the previous number.
 * Return the length of the longest square streak in nums, or return -1 if there is no square streak.
 *
 * A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
 */
public class LongestSquareStreakInAnArray {

    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        Map<Integer, Integer> streakMap = new HashMap<>();
        int maxStreak = -1;

        for (int num : nums) {
            int current = num;
            int streakLength = 0;
            while (numSet.contains(current)) {
                if (streakMap.containsKey(current)) {
                    streakLength += streakMap.get(current);
                    break;
                }
                streakLength++;

                long nextSquare = (long) current * current;
                if (nextSquare > Integer.MAX_VALUE) break;
                current = (int) nextSquare;
            }
            streakMap.put(num, streakLength);
            if (streakLength >= 2) {
                maxStreak = Math.max(maxStreak, streakLength);
            }
        }

        return maxStreak;
    }
    
}
