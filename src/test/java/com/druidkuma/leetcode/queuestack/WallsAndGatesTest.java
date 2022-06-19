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
class WallsAndGatesTest {

    private final WallsAndGates underTest = new WallsAndGates();

    @Test
    void test_example1() {
        assertArrayEquals(new int[][] {
                new int[] {3,-1,0,1},
                new int[] {2,2,1,-1},
                new int[] {1,-1,2,-1},
                new int[] {0,-1,3,4}
        }, underTest.wallsAndGates(new int[][] {
                new int[] {Integer.MAX_VALUE,-1,0,Integer.MAX_VALUE},
                new int[] {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,-1},
                new int[] {Integer.MAX_VALUE,-1,Integer.MAX_VALUE,-1},
                new int[] {0,-1,Integer.MAX_VALUE,Integer.MAX_VALUE}
        }));
    }

    @Test
    void test_example2() {
        assertArrayEquals(new int[][] {new int[] {-1}},
                underTest.wallsAndGates(new int[][] {new int[] {-1}}));
    }
}
