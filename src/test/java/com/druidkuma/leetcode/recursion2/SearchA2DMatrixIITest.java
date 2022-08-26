package com.druidkuma.leetcode.recursion2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 7/1/22
 */
class SearchA2DMatrixIITest {

    private final SearchA2DMatrixII underTest = new SearchA2DMatrixII();

    @Test
    void test_example1() {
        assertTrue(underTest.searchMatrix(new int[][] {
                new int[] {1,4,7,11,15},
                new int[] {2,5,8,12,19},
                new int[] {3,6,9,16,22},
                new int[] {10,13,14,17,24},
                new int[] {18,21,23,26,30}
        }, 5));
    }

    @Test
    void test_example2() {
        assertFalse(underTest.searchMatrix(new int[][] {
                new int[] {1,4,7,11,15},
                new int[] {2,5,8,12,19},
                new int[] {3,6,9,16,22},
                new int[] {10,13,14,17,24},
                new int[] {18,21,23,26,30}
        }, 20));
    }

}
