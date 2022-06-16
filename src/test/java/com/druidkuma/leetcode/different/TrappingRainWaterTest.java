package com.druidkuma.leetcode.different;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/10/22
 */
class TrappingRainWaterTest {

    private final TrappingRainWater underTest = new TrappingRainWater();

    @Test
    void test_example1() {
        assertEquals(9, underTest.trap(new int[] {4, 2, 0, 3, 2, 5}));
    }

    @Test
    void test_example2() {
        assertEquals(6, underTest.trap(new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
}
