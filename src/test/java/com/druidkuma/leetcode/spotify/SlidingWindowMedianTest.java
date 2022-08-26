package com.druidkuma.leetcode.spotify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 7/3/22
 */
class SlidingWindowMedianTest {

    private final SlidingWindowMedian underTest = new SlidingWindowMedian();

    @Test
    void test_example1() {
        assertArrayEquals(new double[] {2.00000,3.00000,3.00000,3.00000,2.00000,3.00000,2.00000}, underTest.medianSlidingWindow(new int[] {1,2,3,4,2,3,1,4,2}, 3));
    }

    @Test
    void test_example2() {
        assertArrayEquals(new double[] {1.00000,-1.00000,-1.00000,3.00000,5.00000,6.00000}, underTest.medianSlidingWindow(new int[] {1,3,-1,-3,5,3,6,7}, 3));
    }

}
