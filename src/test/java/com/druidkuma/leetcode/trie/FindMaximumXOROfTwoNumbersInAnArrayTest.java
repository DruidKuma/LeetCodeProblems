package com.druidkuma.leetcode.trie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/25/22
 */
class FindMaximumXOROfTwoNumbersInAnArrayTest {

    private final FindMaximumXOROfTwoNumbersInAnArray underTest = new FindMaximumXOROfTwoNumbersInAnArray();

    @Test
    void test_example1() {
        assertEquals(28, underTest.findMaximumXOR(new int[] {3, 10, 5, 25, 2, 8}));
    }

    @Test
    void test_example2() {
        assertEquals(127, underTest.findMaximumXOR(new int[] {14, 70, 53, 83, 49, 91, 36, 80, 92, 51, 66, 70}));
    }

}
