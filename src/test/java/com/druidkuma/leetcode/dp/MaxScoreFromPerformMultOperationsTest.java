package com.druidkuma.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/13/22
 */
class MaxScoreFromPerformMultOperationsTest {

    private final MaxScoreFromPerformMultOperations underTest = new MaxScoreFromPerformMultOperations();

    @Test
    void test_example1() {
        assertEquals(14, underTest.maximumScore(new int[] {1, 2, 3}, new int[] {3, 2, 1}));
    }

    @Test
    void test_example2() {
        assertEquals(102, underTest.maximumScore(new int[] {-5, -3, -3, -2, 7, 1}, new int[] {-10, -5, 3, 4, 6}));
    }


}
