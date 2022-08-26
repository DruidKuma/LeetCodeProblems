package com.druidkuma.leetcode.spotify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 7/3/22
 */
class ValidPalindromeTest {

    private final ValidPalindrome underTest = new ValidPalindrome();

    @Test
    void test_example1() {
        assertTrue(underTest.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void test_example2() {
        assertFalse(underTest.isPalindrome("race a car"));
    }

    @Test
    void test_example3() {
        assertTrue(underTest.isPalindrome(" "));
    }

    @Test
    void test_example4() {
        assertFalse(underTest.isPalindrome("0P"));
    }

}
