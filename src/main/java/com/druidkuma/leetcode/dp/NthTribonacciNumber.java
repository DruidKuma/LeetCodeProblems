package com.druidkuma.leetcode.dp;

import java.util.HashMap;
import java.util.Map;

/**
 * 1137
 *
 * The Tribonacci sequence Tn is defined as follows:
 *
 * T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
 *
 * Given n, return the value of Tn.
 */
public class NthTribonacciNumber {
    public int tribonacci(int n) {
        return compute(n, new HashMap<>());
    }

    private int compute(int n, Map<Integer, Integer> memo) {
        if (n == 0) return 0;
        if (n <= 2) return 1;

        if(!memo.containsKey(n)) {
            memo.put(n, compute(n - 1, memo) + compute(n - 2, memo) + compute(n - 3, memo));
        }

        return memo.get(n);
    }
}
