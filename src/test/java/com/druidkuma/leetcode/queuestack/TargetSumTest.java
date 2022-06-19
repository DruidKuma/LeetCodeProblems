package com.druidkuma.leetcode.queuestack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/19/22
 */
class TargetSumTest {

    private final TargetSum underTest = new TargetSum();

    @Test
    void test_example1() {
        assertEquals(5, underTest.findTargetSumWays(new int[] {1, 1, 1, 1, 1}, 3));
    }

    @Test
    void test_example2() {
        assertEquals(1, underTest.findTargetSumWays(new int[] {1}, 1));
    }

}
