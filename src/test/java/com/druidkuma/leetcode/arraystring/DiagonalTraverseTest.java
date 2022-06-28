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
class DiagonalTraverseTest {

    private final DiagonalTraverse underTest = new DiagonalTraverse();

    @Test
    void test_example1() {
        assertArrayEquals(new int[] {1,2,4,7,5,3,6,8,9}, underTest.findDiagonalOrder(new int[][] {
                new int[] {1,2,3},
                new int[] {4,5,6},
                new int[] {7,8,9}
        }));
    }

    @Test
    void test_example2() {
        assertArrayEquals(new int[] {1,2,3,4}, underTest.findDiagonalOrder(new int[][] {
                new int[] {1,2},
                new int[] {3,4}
        }));
    }

}
