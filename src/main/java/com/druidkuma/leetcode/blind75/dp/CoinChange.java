package com.druidkuma.leetcode.blind75.dp;

import java.util.HashMap;
import java.util.Map;

/**
 * 322
 *
 * You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
 *
 * Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
 *
 * You may assume that you have an infinite number of each kind of coin.
 */
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        return helper(coins, amount, new HashMap<>());
    }

    private int helper(int[] coins, int amount, Map<Integer, Integer> memo) {
        if (amount < 0) return -1;
        if (amount == 0) return 0;
        if (!memo.containsKey(amount)) {
            int minCoins = Integer.MAX_VALUE;
            for (int coin : coins) {
                int reminder = amount - coin;
                int reminderCoins = helper(coins, reminder, memo);
                if (reminderCoins < 0) continue;
                minCoins = Math.min(minCoins, 1 + reminderCoins);
            }
            memo.put(amount, minCoins == Integer.MAX_VALUE ? -1 : minCoins);
        }
        return memo.get(amount);
    }
}
