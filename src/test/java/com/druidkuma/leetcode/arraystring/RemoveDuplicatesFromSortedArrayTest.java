package com.druidkuma.leetcode.arraystring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/29/22
 */
class RemoveDuplicatesFromSortedArrayTest {

    private final RemoveDuplicatesFromSortedArray underTest = new RemoveDuplicatesFromSortedArray();

    @Test
    void test_example1() {
        assertEquals(2, underTest.removeDuplicates(new int[] {1, 1, 2}));
    }

    @Test
    void test_example2() {
        assertEquals(5, underTest.removeDuplicates(new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

}
