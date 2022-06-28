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
class ReverseWordsInAStringTest {

    private final ReverseWordsInAString underTest = new ReverseWordsInAString();

    @Test
    void test_example1() {
        assertEquals("blue is sky the", underTest.reverseWords("the sky is blue"));
    }

    @Test
    void test_example2() {
        assertEquals("world hello", underTest.reverseWords("  hello world  "));
    }

    @Test
    void test_example3() {
        assertEquals("example good a", underTest.reverseWords("a good   example"));
    }

}
