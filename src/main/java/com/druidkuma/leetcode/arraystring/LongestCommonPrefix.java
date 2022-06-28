package com.druidkuma.leetcode.arraystring;

/**
 * 14
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        String member = strs[0];
        for (char character : member.toCharArray()) {
            prefix += character;
            for (int i = 1; i < strs.length; i++) {
                if (!strs[i].startsWith(prefix)) return prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
