package com.druidkuma.leetcode.arraystring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/28/22
 */
class MinimumSizeSubarraySumTest {

    private final MinimumSizeSubarraySum underTest = new MinimumSizeSubarraySum();

    @Test
    void test_example1() {
        assertEquals(2, underTest.minSubArrayLen(7, new int[] {2, 3, 1, 2, 4, 3}));
    }

    @Test
    void test_example2() {
        assertEquals(1, underTest.minSubArrayLen(4, new int[] {1, 4, 4}));
    }

    @Test
    void test_example3() {
        assertEquals(0, underTest.minSubArrayLen(11, new int[] {1, 1, 1, 1, 1, 1, 1, 1}));
    }

}
