package com.druidkuma.leetcode.algorithms.algorithm1.bfsdfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/4/22
 */
class FloodFillTest {

    private final FloodFill underTest = new FloodFill();

    @Test
    void test_example1() {
        assertArrayEquals(
                new int [][] {new int[] {2, 2, 2}, new int[] {2, 2, 0}, new int[] {2, 0, 1}},
                underTest.floodFill(new int [][] {new int[] {1, 1, 1}, new int[] {1, 1, 0}, new int[] {1, 0, 1}}, 1, 1, 2));
    }

    @Test
    void test_example2() {
        assertArrayEquals(
                new int [][] {new int[] {2, 2, 2}, new int[] {2, 2, 2}},
                underTest.floodFill(new int [][] {new int[] {0, 0, 0}, new int[] {0, 0, 0}}, 0, 0, 2));
    }

    @Test
    void test_example3() {
        assertArrayEquals(
                new int [][] {new int[] {0, 0, 0}, new int[] {0, 1, 1}},
                underTest.floodFill(new int [][] {new int[] {0, 0, 0}, new int[] {0, 1, 1}}, 1, 1, 1));
    }
}
