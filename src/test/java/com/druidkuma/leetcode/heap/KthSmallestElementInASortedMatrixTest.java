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
class KthSmallestElementInASortedMatrixTest {

    private final KthSmallestElementInASortedMatrix underTest = new KthSmallestElementInASortedMatrix();

    @Test
    void test_example1() {
        assertEquals(13, underTest.kthSmallest(new int[][] {
                new int[] {1, 5, 9},
                new int[] {10, 11, 13},
                new int[] {12, 13, 15}
        }, 8));
    }

    @Test
    void test_example2() {
        assertEquals(-5, underTest.kthSmallest(new int[][] {new int[] {-5}}, 1));
    }

}
