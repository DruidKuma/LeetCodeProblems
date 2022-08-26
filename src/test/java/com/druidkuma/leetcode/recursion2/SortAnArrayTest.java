package com.druidkuma.leetcode.recursion2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/30/22
 */
class SortAnArrayTest {

    private final SortAnArray underTest = new SortAnArray();

    @Test
    void test_example1() {
        assertArrayEquals(new int[] {1, 2, 3, 5}, underTest.sortArray(new int[] {5, 2, 3, 1}));
    }

    @Test
    void test_example2() {
        assertArrayEquals(new int[] {0, 0, 1, 1, 2, 5}, underTest.sortArray(new int[] {5, 1, 1, 2, 0, 0}));
    }

}
