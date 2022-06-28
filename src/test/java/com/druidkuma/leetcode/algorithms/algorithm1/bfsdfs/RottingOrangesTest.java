package com.druidkuma.leetcode.algorithms.algorithm1.bfsdfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/26/22
 */
class RottingOrangesTest {

    private final RottingOranges underTest = new RottingOranges();

    @Test
    void test_example1() {
        assertEquals(4, underTest.orangesRotting(new int[][] {
                new int[] {2,1,1},
                new int[] {1,1,0},
                new int[] {0,1,1}
        }));
    }

    @Test
    void test_example2() {
        assertEquals(-1, underTest.orangesRotting(new int[][] {
                new int[] {2,1,1},
                new int[] {0,1,1},
                new int[] {1,0,1}
        }));
    }

    @Test
    void test_example3() {
        assertEquals(0, underTest.orangesRotting(new int[][] {
                new int[] {0,2}
        }));
    }

}
