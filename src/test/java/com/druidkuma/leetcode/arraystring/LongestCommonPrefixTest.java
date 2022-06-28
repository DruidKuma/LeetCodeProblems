package com.druidkuma.leetcode.arraystring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/28/22
 */
class LongestCommonPrefixTest {

    private final LongestCommonPrefix underTest = new LongestCommonPrefix();

    @Test
    void test_example1() {
        assertEquals("fl", underTest.longestCommonPrefix(new String[] {"flower","flow","flight"}));
    }

    @Test
    void test_example2() {
        assertEquals("", underTest.longestCommonPrefix(new String[] {"dog","racecar","car"}));
    }

}
