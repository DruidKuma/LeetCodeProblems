package com.druidkuma.leetcode.different;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/27/22
 */
class TwoSumTest {

    private final TwoSum underTest = new TwoSum();

    @Test
    void test_example1() {
        assertArrayEquals(new int[] {0, 1}, underTest.twoSum(new int[] {2, 7, 11, 15}, 9));
    }

    @Test
    void test_example2() {
        assertArrayEquals(new int[] {1, 2}, underTest.twoSum(new int[] {3, 2, 4}, 6));
    }

    @Test
    void test_example3() {
        assertArrayEquals(new int[] {0, 1}, underTest.twoSum(new int[] {3, 3}, 6));
    }

}
