package com.druidkuma.leetcode.blind75;

import com.druidkuma.leetcode.blind75.array.MaximumProductSubarray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 7/2/22
 */
class MaximumProductSubarrayTest {

    private final MaximumProductSubarray underTest = new MaximumProductSubarray();

    @Test
    void test_example1() {
        assertEquals(6, underTest.maxProduct(new int[] {2, 3, -2, 4}));
    }

    @Test
    void test_example2() {
        assertEquals(0, underTest.maxProduct(new int[] {-2, 0, -1}));
    }

}
