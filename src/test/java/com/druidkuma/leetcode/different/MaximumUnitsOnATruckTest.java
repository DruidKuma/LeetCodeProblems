package com.druidkuma.leetcode.different;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 7/1/22
 */
class MaximumUnitsOnATruckTest {

    private final MaximumUnitsOnATruck underTest = new MaximumUnitsOnATruck();

    @Test
    void test_example1() {
        assertEquals(8, underTest.maximumUnits(new int[][] {
                new int[] {1, 3},
                new int[] {2, 2},
                new int[] {3, 1},
        }, 4));
    }

    @Test
    void test_example2() {
        assertEquals(91, underTest.maximumUnits(new int[][] {
                new int[] {5, 10},
                new int[] {2, 5},
                new int[] {4, 7},
                new int[] {3, 9},
        }, 10));
    }

}
