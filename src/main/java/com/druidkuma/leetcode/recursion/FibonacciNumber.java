package com.druidkuma.leetcode.recursion;

import java.util.HashMap;
import java.util.Map;

/**
 * 509
 *
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
 * such that each number is the sum of the two preceding ones, starting from 0 and 1.
 *
 * That is,
 *
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * Given n, calculate F(n).
 */
public class FibonacciNumber {
    public int fib(int n) {
        return fib(n, new HashMap<>(Map.of(0, 0, 1, 1)));
    }

    public int fib(int n, Map<Integer, Integer> memo) {
        if (!memo.containsKey(n)) memo.put(n, fib(n - 1, memo) + fib(n - 2, memo));
        return memo.get(n);
    }
}
