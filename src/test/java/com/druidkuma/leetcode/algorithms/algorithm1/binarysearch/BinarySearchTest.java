package com.druidkuma.leetcode.algorithms.algorithm1.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    private final BinarySearch underTest = new BinarySearch();

    @Test
    void test_example1() {
        assertEquals(4, underTest.search(new int[] {-1, 0, 3, 5, 9, 12}, 9));
    }

    @Test
    void test_example2() {
        assertEquals(-1, underTest.search(new int[] {-1, 0, 3, 5, 9, 12}, 2));
    }

    @Test
    void test_targetNumberLowerThanMinNumberInTheList() {
        assertEquals(-1, underTest.search(new int[] {-1, 0, 3, 5, 9, 12}, -10));
    }

    @Test
    void test_targetNumberGreaterThanMaxNumberInTheList() {
        assertEquals(-1, underTest.search(new int[] {-1, 0, 3, 5, 9, 12}, 15));
    }

    @Test
    void test_targetNumberIsMinNumberInTheList() {
        assertEquals(0, underTest.search(new int[] {-1, 0, 3, 5, 9, 12}, -1));
    }

    @Test
    void test_targetNumberIsMaxNumberInTheList() {
        assertEquals(5, underTest.search(new int[] {-1, 0, 3, 5, 9, 12}, 12));
    }

    @Test
    void test_singleDigitListFound() {
        assertEquals(0, underTest.search(new int[] {0}, 0));
    }

    @Test
    void test_singleDigitListNotFound() {
        assertEquals(-1, underTest.search(new int[] {0}, 1));
    }
}