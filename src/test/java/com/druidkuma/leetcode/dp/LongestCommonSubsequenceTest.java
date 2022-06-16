package com.druidkuma.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/13/22
 */
class LongestCommonSubsequenceTest {

    private final LongestCommonSubsequence underTest = new LongestCommonSubsequence();

    @Test
    void test_example1() {
        assertEquals(3, underTest.longestCommonSubsequence("abcde", "ace"));
    }

    @Test
    void test_example2() {
        assertEquals(3, underTest.longestCommonSubsequence("abc", "abc"));
    }

    @Test
    void test_example3() {
        assertEquals(0, underTest.longestCommonSubsequence("abc", "def"));
    }
}
