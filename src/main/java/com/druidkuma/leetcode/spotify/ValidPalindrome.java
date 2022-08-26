package com.druidkuma.leetcode.spotify;

/**
 * 125
 *
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int begin = 0;
        int end = s.length() - 1;
        while (begin < end) {
            char beginC = s.charAt(begin);
            char endC = s.charAt(end);
            if (!Character.isLetterOrDigit(beginC)) begin++;
            else if (!Character.isLetterOrDigit(endC)) end--;
            else if (Character.toLowerCase(beginC) != Character.toLowerCase(endC)) return false;
            else {
                begin++;
                end--;
            }
        }
        return true;
    }
}
