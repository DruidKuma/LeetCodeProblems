package com.druidkuma.leetcode.algorithms.algorithm1.bfsdfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/5/22
 */
class MaxAreaOfIslandTest {

    private final MaxAreaOfIsland underTest = new MaxAreaOfIsland();

    @Test
    void test_example1() {
        assertEquals(6, underTest.maxAreaOfIsland(
                new int[][] {
                        new int[]{0,0,1,0,0,0,0,1,0,0,0,0,0},
                        new int[]{0,0,0,0,0,0,0,1,1,1,0,0,0},
                        new int[]{0,1,1,0,1,0,0,0,0,0,0,0,0},
                        new int[]{0,1,0,0,1,1,0,0,1,0,1,0,0},
                        new int[]{0,1,0,0,1,1,0,0,1,1,1,0,0},
                        new int[]{0,0,0,0,0,0,0,0,0,0,1,0,0},
                        new int[]{0,0,0,0,0,0,0,1,1,1,0,0,0},
                        new int[]{0,0,0,0,0,0,0,1,1,0,0,0,0}
                }
        ));
    }

    @Test
    void test_example2() {
        assertEquals(0, underTest.maxAreaOfIsland(
                new int[][] {
                        new int[]{0,0,0,0,0,0,0,0},
                }
        ));
    }
}
