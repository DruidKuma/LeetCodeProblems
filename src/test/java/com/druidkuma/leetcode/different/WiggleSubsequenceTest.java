package com.druidkuma.leetcode.different;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 7/3/22
 */
class WiggleSubsequenceTest {

    private final WiggleSubsequence underTest = new WiggleSubsequence();

    @Test
    void test_example1() {
        assertEquals(6, underTest.wiggleMaxLength(new int[] {1, 7, 4, 9, 2, 5}));
    }

    @Test
    void test_example2() {
        assertEquals(7, underTest.wiggleMaxLength(new int[] {1,17,5,10,13,15,10,5,16,8}));
    }

    @Test
    void test_example3() {
        assertEquals(2, underTest.wiggleMaxLength(new int[] {1,2,3,4,5,6,7,8,9}));
    }
}
