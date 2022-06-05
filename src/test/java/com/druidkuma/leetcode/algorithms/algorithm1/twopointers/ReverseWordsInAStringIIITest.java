package com.druidkuma.leetcode.algorithms.algorithm1.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/1/22
 */
class ReverseWordsInAStringIIITest {

    private final ReverseWordsInAStringIII underTest = new ReverseWordsInAStringIII();

    @Test
    void test_example1() {
        assertEquals("s'teL ekat edoCteeL tsetnoc", underTest.reverseWords("Let's take LeetCode contest"));
    }

    @Test
    void test_example2() {
        assertEquals("doG gniD", underTest.reverseWords("God Ding"));
    }
}
