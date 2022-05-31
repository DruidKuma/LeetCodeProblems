package com.druidkuma.leetcode.algorithms.algorithm1.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    private final RotateArray underTest = new RotateArray();

    @Test
    void test_example1() {
        assertArrayEquals(new int[] {5, 6, 7, 1, 2, 3, 4}, underTest.rotate(new int[] {1, 2, 3, 4, 5, 6, 7}, 3));
    }

    @Test
    void test_example2() {
        assertArrayEquals(new int[] {3, 99, -1, -100}, underTest.rotate(new int[] {-1, -100, 3, 99}, 2));
    }
}