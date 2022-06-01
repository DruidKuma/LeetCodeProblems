package com.druidkuma.leetcode.different;

/**
 * 9
 *
 * Given an integer x, return true if x is palindrome integer.
 *
 * An integer is a palindrome when it reads the same backward as forward.
 *
 * For example, 121 is a palindrome while 123 is not.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        return x >= 0 && x == reverseNumber(x);
    }

    private int reverseNumber(int x) {
        int result = 0;
        while (x != 0) {
            int remainder = x % 10;
            result = result * 10 + remainder;
            x /= 10;
        }
        return result;
    }
}
