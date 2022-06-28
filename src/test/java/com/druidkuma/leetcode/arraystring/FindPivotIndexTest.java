package com.druidkuma.leetcode.arraystring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/27/22
 */
class FindPivotIndexTest {

    private final FindPivotIndex underTest = new FindPivotIndex();

    @Test
    void test_example1() {
        assertEquals(3, underTest.pivotIndex(new int[] {1, 7, 3, 6, 5, 6}));
    }

    @Test
    void test_example2() {
        assertEquals(-1, underTest.pivotIndex(new int[] {1, 2, 3}));
    }

    @Test
    void test_example3() {
        assertEquals(0, underTest.pivotIndex(new int[] {2, 1, -1}));
    }

    @Test
    void test_example4() {
        assertEquals(-1, underTest.pivotIndex(new int[] {-1, -1, -1, -1, -1, -1}));
    }
}
