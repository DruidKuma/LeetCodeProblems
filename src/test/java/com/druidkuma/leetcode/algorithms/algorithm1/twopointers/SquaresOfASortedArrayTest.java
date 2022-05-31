package com.druidkuma.leetcode.algorithms.algorithm1.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaresOfASortedArrayTest {

    private final SquaresOfASortedArray underTest = new SquaresOfASortedArray();

    @Test
    void test_example1() {
        assertArrayEquals(new int[] {0, 1, 9, 16, 100}, underTest.sortedSquares(new int[] {-4, -1, 0, 3, 10}));
    }

    @Test
    void test_example2() {
        assertArrayEquals(new int[] {4, 9, 9, 49, 121}, underTest.sortedSquares(new int[] {-7, -3, 2, 3, 11}));
    }

}