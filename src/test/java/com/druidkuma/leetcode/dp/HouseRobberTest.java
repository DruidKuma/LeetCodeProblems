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
class HouseRobberTest {

    private final HouseRobber underTest = new HouseRobber();

    @Test
    void test_example1() {
        assertEquals(4, underTest.rob(new int[] {1, 2, 3, 1}));
    }

    @Test
    void test_example2() {
        assertEquals(12, underTest.rob(new int[] {2, 7, 9, 3, 1}));
    }
}
