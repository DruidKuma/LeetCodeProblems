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
class MoveZeroesTest {

    private final MoveZeroes underTest = new MoveZeroes();

    @Test
    void test_example1() {
        assertArrayEquals(new int[] {1, 3, 12, 0, 0}, underTest.moveZeroes(new int[] {0, 1, 0, 3, 12}));
        assertArrayEquals(new int[] {1, 3, 12, 0, 0}, underTest.moveZerosOptimal(new int[] {0, 1, 0, 3, 12}));
    }

    @Test
    void test_example2() {
        assertArrayEquals(new int[] {0}, underTest.moveZeroes(new int[] {0}));
        assertArrayEquals(new int[] {0}, underTest.moveZerosOptimal(new int[] {0}));
    }

    @Test
    void test_example3() {
        assertArrayEquals(new int[] {1, 0, 0}, underTest.moveZeroes(new int[] {0, 0, 1}));
        assertArrayEquals(new int[] {1, 0, 0}, underTest.moveZerosOptimal(new int[] {0, 0, 1}));
    }

}
