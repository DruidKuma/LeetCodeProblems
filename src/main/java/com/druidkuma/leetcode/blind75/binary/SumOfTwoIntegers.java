package com.druidkuma.leetcode.blind75.binary;

/**
 * 371
 *
 * Given two integers a and b, return the sum of the two integers without using the operators + and -.
 */
public class SumOfTwoIntegers {
    //don't work on all test cases
    public int getSum(int a, int b) {
        return Double.valueOf(Math.log10(Math.pow(10, a) * Math.pow(10, b))).intValue();
    }

    public int getSumBits(int a, int b) {
        while (b != 0) {
            int answer = a ^ b;
            int carry = (a & b) << 1;
            a = answer;
            b = carry;
        }

        return a;
    }
}
