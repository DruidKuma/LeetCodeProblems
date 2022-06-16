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
class TopKFrequentElementsTest {

    private final TopKFrequentElements underTest = new TopKFrequentElements();

    @Test
    void test_example1() {
        assertArrayEquals(new int[] {1, 2}, underTest.topKFrequent(new int[] {1, 1, 1, 2, 2, 3}, 2));
    }

    @Test
    void test_example2() {
        assertArrayEquals(new int[] {1}, underTest.topKFrequent(new int[] {1}, 1));
    }
}
