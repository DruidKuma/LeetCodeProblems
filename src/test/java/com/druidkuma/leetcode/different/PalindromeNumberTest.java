package com.druidkuma.leetcode.different;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/1/22
 */
class PalindromeNumberTest {

    private final PalindromeNumber underTest = new PalindromeNumber();

    @Test
    void test_example1() {
        assertTrue(underTest.isPalindrome(121));
    }

    @Test
    void test_example2() {
        assertFalse(underTest.isPalindrome(-121));
    }

    @Test
    void test_example3() {
        assertFalse(underTest.isPalindrome(10));
    }

}
