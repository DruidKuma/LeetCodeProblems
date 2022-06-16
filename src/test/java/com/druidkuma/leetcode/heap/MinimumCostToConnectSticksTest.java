package com.druidkuma.leetcode.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/16/22
 */
class MinimumCostToConnectSticksTest {

    private final MinimumCostToConnectSticks underTest = new MinimumCostToConnectSticks();

    @Test
    void test_example1() {
        assertEquals(14, underTest.connectSticks(new int[] {2, 4, 3}));
    }

    @Test
    void test_example2() {
        assertEquals(30, underTest.connectSticks(new int[] {1, 8, 3, 5}));
    }

    @Test
    void test_example3() {
        assertEquals(0, underTest.connectSticks(new int[] {5}));
    }
}
