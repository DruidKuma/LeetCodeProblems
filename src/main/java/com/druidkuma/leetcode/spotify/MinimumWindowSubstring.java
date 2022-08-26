package com.druidkuma.leetcode.spotify;

/**
 * 76
 *
 * Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".
 *
 * The testcases will be generated such that the answer is unique.
 *
 * A substring is a contiguous sequence of characters within the string.
 */
public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        int[] count = new int[128];
        for (char ch : t.toCharArray()) count[ch]++;

        String windowString = "";
        int windowLeft = 0;
        int windowRight = 0;
        int charsFoundInWindow = 0;
        int totalCharsToFind = t.length();
        int minWindowLen = Integer.MAX_VALUE;

        while (windowRight < s.length()) {
            int currentChar = s.charAt(windowRight);
            if (--count[currentChar] >= 0) charsFoundInWindow++;

            while (charsFoundInWindow == totalCharsToFind) {
                int currentWindowLen = windowRight - windowLeft + 1;
                if(minWindowLen > currentWindowLen) {
                    minWindowLen = currentWindowLen;
                    windowString = s.substring(windowLeft, windowRight + 1);
                }
                if (++count[s.charAt(windowLeft++)] > 0) charsFoundInWindow--;
            }
            windowRight++;
        }
        return windowString;
    }
}
