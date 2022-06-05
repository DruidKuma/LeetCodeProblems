package com.druidkuma.leetcode.algorithms.algorithm1.twopointers;

/**
 * 344
 *
 * Write a function that reverses a string. The input string is given as an array of characters s.
 *
 * You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class ReverseString {
    public char[] reverseString(char[] s) {
        int firstPointer = 0;
        int secondPointer = s.length - 1;

        while (firstPointer < secondPointer) {
            swap(s, firstPointer, secondPointer);
            firstPointer++;
            secondPointer--;
        }

        return s;
    }

    private void swap(char[] s, int firstPointer, int secondPointer) {
        char temp = s[firstPointer];
        s[firstPointer] = s[secondPointer];
        s[secondPointer] = temp;
    }
}
