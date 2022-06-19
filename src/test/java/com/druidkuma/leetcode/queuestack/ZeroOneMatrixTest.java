package com.druidkuma.leetcode.queuestack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/19/22
 */
class ZeroOneMatrixTest {

    private final ZeroOneMatrix underTest = new ZeroOneMatrix();

    @Test
    void test_example1() {
        assertArrayEquals(new int[][] {
                new int[] {0,0,0},
                new int[] {0,1,0},
                new int[] {0,0,0}
        }, underTest.updateMatrix(new int[][] {
                new int[] {0,0,0},
                new int[] {0,1,0},
                new int[] {0,0,0}
        }));
    }

    @Test
    void test_example2() {
        assertArrayEquals(new int[][] {
                new int[] {0,0,0},
                new int[] {0,1,0},
                new int[] {1,2,1}
        }, underTest.updateMatrix(new int[][] {
                new int[] {0,0,0},
                new int[] {0,1,0},
                new int[] {1,1,1}
        }));
    }
}
