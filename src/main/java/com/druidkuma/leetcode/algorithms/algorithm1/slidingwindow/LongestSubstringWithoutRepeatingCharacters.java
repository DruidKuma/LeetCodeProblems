package com.druidkuma.leetcode.algorithms.algorithm1.slidingwindow;

import java.util.HashSet;
import java.util.Set;

/**
 * 3
 *
 * Given a string s, find the length of the longest substring without repeating characters.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;

        int index = 0;
        int currentLength = 0;
        Set<Character> uniqueChars = new HashSet<>();
        while (index < s.length()) {
            for (int i = index; i < s.length(); i++) {
                if (uniqueChars.add(s.charAt(i))) {
                    currentLength++;
                }
                else {
                    max = Math.max(currentLength, max);
                    currentLength = 0;
                    uniqueChars.clear();
                    break;
                }
            }

            index++;
        }


        return Math.max(max, currentLength);
    }
}
