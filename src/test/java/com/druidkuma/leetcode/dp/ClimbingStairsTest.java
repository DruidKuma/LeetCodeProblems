package com.druidkuma.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/10/22
 */
class ClimbingStairsTest {

    private final ClimbingStairs underTest = new ClimbingStairs();

    @Test
    void test_example1() {
        assertEquals(2, underTest.climbStairs(2));
    }

    @Test
    void test_example2() {
        assertEquals(3, underTest.climbStairs(3));
    }

    @Test
    void test_example3() {
        assertEquals(21, underTest.climbStairs(7));
    }

}
