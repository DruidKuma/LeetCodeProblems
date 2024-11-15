package com.druidkuma.leetcode.snap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 25.10.2024
 */
class MinimumNumberOfRefuelingStopsTest {
    
    private final MinimumNumberOfRefuelingStops underTest = new MinimumNumberOfRefuelingStops();
    
    @Test
    void test_example1() {
        var actual = underTest.minRefuelStops(1, 1, new int[][] {});
        assertEquals(actual, 0);
    }

    @Test
    void test_example2() {
        var actual = underTest.minRefuelStops(100, 1, new int[][] {new int[] {10, 100}});
        assertEquals(actual, -1);
    }

    @Test
    void test_example3() {
        var actual = underTest.minRefuelStops(100, 10, new int[][] {new int[] {10, 60}, new int[] {20, 30}, new int[] {30, 30}, new int[] {60, 40}});
        assertEquals(actual, 2);
    }

}