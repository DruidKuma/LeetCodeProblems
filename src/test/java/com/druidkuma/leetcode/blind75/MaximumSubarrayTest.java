package com.druidkuma.leetcode.blind75;

import com.druidkuma.leetcode.blind75.array.MaximumSubarray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 7/2/22
 */
class MaximumSubarrayTest {

    private final MaximumSubarray underTest = new MaximumSubarray();

    @Test
    void test_example1() {
        assertEquals(6, underTest.maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    void test_example2() {
        assertEquals(1, underTest.maxSubArray(new int[] {1}));
    }

    @Test
    void test_example3() {
        assertEquals(23, underTest.maxSubArray(new int[] {5,4,-1,7,8}));
    }

    @Test
    void test_example4() {
        assertEquals(1, underTest.maxSubArray(new int[] {-2, 1}));
    }

}
