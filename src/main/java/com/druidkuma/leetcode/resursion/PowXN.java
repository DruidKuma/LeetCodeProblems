package com.druidkuma.leetcode.resursion;

/**
 * 50
 *
 * Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
 */
public class PowXN {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            N = -N;
            x = 1 / x;
        }
        return helper(x, N);
    }

    private double helper(double x, long n) {
        if (n == 0) return 1.0;

        double half = helper(x, n / 2);
        if (n % 2 == 0) return half * half;
        else return half * half * x;
    }
}
