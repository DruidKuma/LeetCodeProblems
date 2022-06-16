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
class KClosestPointsToOriginTest {

    private final KClosestPointsToOrigin underTest = new KClosestPointsToOrigin();

    @Test
    void test_example1() {
        assertArrayEquals(new int[][] {new int[] {-2,2}}, underTest.kClosest(new int[][] {
                new int[] {1, 3},
                new int[] {-2, 2}
        }, 1));
    }

    @Test
    void test_example2() {
        assertArrayEquals(new int[][] { new int[] {3, 3}, new int[] {-2, 4}}, underTest.kClosest(new int[][] {
                new int[] {3, 3},
                new int[] {5, -1},
                new int[] {-2, 4}
        }, 2));
    }

}
