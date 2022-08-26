package com.druidkuma.leetcode.different;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 7/7/22
 */
class InterleavingStringTest {

    private final InterleavingString underTest = new InterleavingString();

    @Test
    void test_example1() {
        assertTrue(underTest.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
    }

    @Test
    void test_example2() {
        assertFalse(underTest.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
    }

    @Test
    void test_example3() {
        assertTrue(underTest.isInterleave("", "", ""));
    }

}
