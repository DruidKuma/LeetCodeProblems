package com.druidkuma.leetcode.arraystring;

/**
 * 66
 *
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 *
 * Increment the large integer by one and return the resulting array of digits.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int idx = n - 1; idx >= 0; --idx) {
            if (digits[idx] == 9) {
                digits[idx] = 0;
            }
            else {
                digits[idx]++;
                return digits;
            }
        }
        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }

    public int[] plusOneOld(int[] digits) {
        int reminder = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += reminder;
            reminder = 0;
            if (digits[i] >= 10) {
                reminder = digits[i] % 9;
                digits[i] = digits[i] % 10;
            }
        }
        if (reminder == 0) return digits;
        else {
            int[] result = new int[digits.length + 1];
            result[0] = reminder;
            for (int i = 0; i < digits.length; i++) {
                result[i+1] = digits[i];
            }
            return result;
        }
    }
}
