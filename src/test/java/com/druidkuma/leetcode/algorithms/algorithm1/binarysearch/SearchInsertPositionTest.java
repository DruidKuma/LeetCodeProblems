package com.druidkuma.leetcode.algorithms.algorithm1.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    private final SearchInsertPosition underTest = new SearchInsertPosition();

    @Test
    void test_example1() {
        assertEquals(2, underTest.searchInsert(new int[] {1, 3, 5, 6}, 5));
    }

    @Test
    void test_example2() {
        assertEquals(1, underTest.searchInsert(new int[] {1, 3, 5, 6}, 2));
    }

    @Test
    void test_example3() {
        assertEquals(4, underTest.searchInsert(new int[] {1, 3, 5, 6}, 7));
    }

}