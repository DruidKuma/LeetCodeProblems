package com.druidkuma.leetcode.spotify;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 128
 *
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 *
 * You must write an algorithm that runs in O(n) time.
 */
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int longestSequence = 0;
        for (Integer num : set) {
            //if this is first number in sequence
            if (!set.contains(num - 1)) {
                int curSequence = 1;
                int add = 1;
                while (set.contains(num + add)) {
                    curSequence++;
                    add++;
                }
                longestSequence = Math.max(longestSequence, curSequence);
            }
        }
        return longestSequence;
    }
}
