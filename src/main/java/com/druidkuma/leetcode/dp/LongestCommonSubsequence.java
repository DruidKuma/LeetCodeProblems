package com.druidkuma.leetcode.dp;

/**
 * 1143
 *
 * Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.
 *
 * A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
 *
 * For example, "ace" is a subsequence of "abcde".
 * A common subsequence of two strings is a subsequence that is common to both strings.
 */
public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        return solution(text1.length() - 1, text2.length() - 1, text1, text2, new int[text1.length()][text2.length()]);
    }

    private int solution(int i, int j, String text1, String text2, int[][] memo) {
        if (i < 0 || j < 0) return 0;

        if (memo[i][j] == 0) {
            if(text1.charAt(i) == text2.charAt(j)) {
                memo[i][j] = 1 + solution(i - 1, j - 1, text1, text2, memo);
            }
            else {
                memo[i][j] = Math.max(solution(i - 1, j, text1, text2, memo), solution(i, j - 1, text1, text2, memo));
            }
        }
        return memo[i][j];
    }
}
