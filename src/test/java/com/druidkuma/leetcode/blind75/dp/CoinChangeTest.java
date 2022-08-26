package com.druidkuma.leetcode.blind75.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 7/3/22
 */
class CoinChangeTest {

    private final CoinChange underTest = new CoinChange();

    @Test
    void test_example1() {
        assertEquals(3, underTest.coinChange(new int[] {1, 2, 5}, 11));
    }

    @Test
    void test_example2() {
        assertEquals(-1, underTest.coinChange(new int[] {2}, 3));
    }

    @Test
    void test_example3() {
        assertEquals(0, underTest.coinChange(new int[] {1}, 0));
    }

}
