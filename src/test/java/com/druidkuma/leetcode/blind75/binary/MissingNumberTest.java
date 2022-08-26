package com.druidkuma.leetcode.blind75.binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 7/3/22
 */
class MissingNumberTest {

    private final MissingNumber underTest = new MissingNumber();

    @Test
    void test_example1() {
        assertEquals(2, underTest.missingNumber(new int[] {3, 0, 1}));
    }

    @Test
    void test_example2() {
        assertEquals(2, underTest.missingNumber(new int[] {0, 1}));
    }

    @Test
    void test_example3() {
        assertEquals(8, underTest.missingNumber(new int[] {9,6,4,2,3,5,7,0,1}));
    }
}
