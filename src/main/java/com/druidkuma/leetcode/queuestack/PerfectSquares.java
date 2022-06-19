package com.druidkuma.leetcode.queuestack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 279
 *
 * Given an integer n, return the least number of perfect square numbers that sum to n.
 *
 * A perfect square is an integer that is the square of an integer; in other words,
 * it is the product of some integer with itself. For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.
 */
public class PerfectSquares {
    public int numSquares(int n) {
        List<Integer> squares = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            squares.add(i * i);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        int count = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int remainder = queue.poll();
                for (Integer square : squares) {
                    if (remainder - square == 0) return count;
                    if (remainder > square) {
                        queue.offer(remainder - square);
                    }
                }
            }
            count++;
        }
        return n;
    }
}
