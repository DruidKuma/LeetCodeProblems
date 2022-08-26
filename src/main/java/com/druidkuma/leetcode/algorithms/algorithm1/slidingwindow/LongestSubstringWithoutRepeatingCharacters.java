package com.druidkuma.leetcode.algorithms.algorithm1.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 3
 *
 * Given a string s, find the length of the longest substring without repeating characters.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map= new HashMap<>();
        int start=0, len=0;

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (map.getOrDefault(c, -1) >= start) {
                start = map.get(c) + 1;
            }
            len = Math.max(len, i-start+1);
            map.put(c, i);
        }

        return len;
    }

    public int lengthOfLongestSubstringBruteForce(String s) {
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
