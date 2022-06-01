package com.druidkuma.leetcode.algorithms.algorithm1.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 5/31/22
 */
class TwoSumIITest {

    private final TwoSumII underTest = new TwoSumII();

    @Test
    void test_example1() {
        assertArrayEquals(new int[] {1, 2}, underTest.twoSum(new int[] {2, 7, 11, 15}, 9));
    }

    @Test
    void test_example2() {
        assertArrayEquals(new int[] {1, 3}, underTest.twoSum(new int[] {2, 3, 4}, 6));
    }

    @Test
    void test_example3() {
        assertArrayEquals(new int[] {1, 2}, underTest.twoSum(new int[] {-1, 0}, -1));
    }

}
