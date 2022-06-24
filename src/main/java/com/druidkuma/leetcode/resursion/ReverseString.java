package com.druidkuma.leetcode.resursion;

/**
 * 344
 *
 * Write a function that reverses a string. The input string is given as an array of characters s.
 *
 * You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class ReverseString {
    public char[] reverseString(char[] s) {
        reverseStringRecur(s);
        return s;
    }

    public void reverseStringRecur(char[] s) {
        helper(0, s);
    }

    public void helper(int index, char[] s) {
        int swapIndex = s.length - 1 - index;
        if (index > swapIndex) return;
        char temp = s[index];
        s[index] = s[swapIndex];
        s[swapIndex] = temp;
        helper(index + 1, s);
    }
}
