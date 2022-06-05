package com.druidkuma.leetcode.algorithms.algorithm1.slidingwindow;

import java.util.Arrays;

/**
 * 567
 *
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 *
 * In other words, return true if one of s1's permutations is the substring of s2
 */
public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        s1 = sortString(s1);

        for (int i = 0; i < s2.length(); i++) {
            if (s1.indexOf(s2.charAt(i)) >= 0) {
                if(i + s1.length() > s2.length()) return false;
                String toTest = sortString(s2.substring(i, i + s1.length()));
                if (s1.equals(toTest)) return true;
            }
        }

        return false;
    }

    private String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
