package com.druidkuma.leetcode.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/16/22
 */
class TheKWeakestRowsInAMatrixTest {

    private final TheKWeakestRowsInAMatrix underTest = new TheKWeakestRowsInAMatrix();

    @Test
    void test_example1() {
        assertArrayEquals(new int[] {2, 0, 3}, underTest.kWeakestRows(new int[][] {
                new int[] {1, 1, 0, 0, 0},
                new int[] {1, 1, 1, 1, 0},
                new int[] {1, 0, 0, 0, 0},
                new int[] {1, 1, 0, 0, 0},
                new int[] {1, 1, 1, 1, 1},
        }, 3));
    }

    @Test
    void test_example2() {
        assertArrayEquals(new int[] {0, 2}, underTest.kWeakestRows(new int[][] {
                new int[] {1, 0, 0, 0},
                new int[] {1, 1, 1, 1},
                new int[] {1, 0, 0, 0},
                new int[] {1, 0, 0, 0},
        }, 2));
    }
}
