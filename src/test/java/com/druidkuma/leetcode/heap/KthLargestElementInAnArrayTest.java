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
class KthLargestElementInAnArrayTest {

    private final KthLargestElementInAnArray underTest = new KthLargestElementInAnArray();

    @Test
    void test_example1() {
        assertEquals(5, underTest.findKthLargest(new int[] {3, 2, 1, 5, 6, 4}, 2));
    }

    @Test
    void test_example2() {
        assertEquals(4, underTest.findKthLargest(new int[] {3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }
}
