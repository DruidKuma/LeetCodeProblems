package com.druidkuma.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/11/22
 */
class MinCostClimbingStairsTest {

    private final MinCostClimbingStairs underTest = new MinCostClimbingStairs();

    @Test
    void test_example1() {
        assertEquals(15, underTest.minCostClimbingStairs(new int[] {10, 15, 20}));
    }

    @Test
    void test_example2() {
        assertEquals(6, underTest.minCostClimbingStairs(new int[] {1,100,1,1,1,100,1,1,100,1}));
    }

}
