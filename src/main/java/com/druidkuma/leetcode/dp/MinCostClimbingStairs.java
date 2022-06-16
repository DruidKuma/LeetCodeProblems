package com.druidkuma.leetcode.dp;

import java.util.HashMap;
import java.util.Map;

/**
 * 746
 *
 * You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
 * Once you pay the cost, you can either climb one or two steps.
 *
 * You can either start from the step with index 0, or the step with index 1.
 *
 * Return the minimum cost to reach the top of the floor.
 */
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        return minCost(cost.length, cost, new HashMap<>());
    }

    private int minCost(int i, int[] costs, Map<Integer, Integer> memo) {
        if (i <= 1) return 0;

        if (!memo.containsKey(i)) {
            memo.put(i, Math.min(costs[i - 1] + minCost(i - 1, costs, memo), costs[i - 2] + minCost(i - 2, costs, memo)));
        }

        return memo.get(i);
    }
}
