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
class FurthestBuildingYouCanReachTest {

    private final FurthestBuildingYouCanReach underTest = new FurthestBuildingYouCanReach();

    @Test
    void test_example1() {
        assertEquals(4, underTest.furthestBuilding(new int[] {4, 2, 7, 6, 9, 14, 12}, 5, 1));
    }

    @Test
    void test_example2() {
        assertEquals(7, underTest.furthestBuilding(new int[] {4, 12, 2, 7, 3, 18, 20, 3, 19}, 10, 2));
    }

    @Test
    void test_example3() {
        assertEquals(3, underTest.furthestBuilding(new int[] {14, 3, 19, 3}, 17, 0));
    }

    @Test
    void test_example4() {
        assertEquals(5, underTest.furthestBuilding(new int[] {1, 5, 1, 2, 3, 4, 10000}, 4, 1));
    }

}
