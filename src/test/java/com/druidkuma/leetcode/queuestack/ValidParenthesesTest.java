package com.druidkuma.leetcode.queuestack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/19/22
 */
class ValidParenthesesTest {

    private final ValidParentheses underTest = new ValidParentheses();

    @Test
    void test_example1() {
        assertTrue(underTest.isValid("()"));
    }

    @Test
    void test_example2() {
        assertTrue(underTest.isValid("()[]{}"));
    }

    @Test
    void test_example3() {
        assertFalse(underTest.isValid("(]"));
    }

}
