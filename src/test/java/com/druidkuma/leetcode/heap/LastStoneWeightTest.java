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
class LastStoneWeightTest {

    private final LastStoneWeight underTest = new LastStoneWeight();

    @Test
    void test_example1() {
        assertEquals(1, underTest.lastStoneWeight(new int[] {2, 7, 4, 1, 8, 1}));
    }

    @Test
    void test_example2() {
        assertEquals(1, underTest.lastStoneWeight(new int[] {1}));
    }

    @Test
    void test_example3() {
        assertEquals(0, underTest.lastStoneWeight(new int[] {2, 2}));
    }
}
