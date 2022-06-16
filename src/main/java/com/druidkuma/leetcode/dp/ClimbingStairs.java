package com.druidkuma.leetcode.dp;

/**
 * 70
 *
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] arr = new int[] {1, 2};
        for (int i = 2; i < n; i++) {
            int prev = arr[1];
            int prevprev = arr[0];
            int next = prevprev + prev;
            arr[0] = prev;
            arr[1] = next;
        }
        return n == 1 ? arr[0] : arr[1];
    }
}
