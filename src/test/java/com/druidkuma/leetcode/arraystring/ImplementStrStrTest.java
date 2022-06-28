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
class ImplementStrStrTest {

    private final ImplementStrStr underTest = new ImplementStrStr();

    @Test
    void test_example1() {
        assertEquals(2, underTest.strStr("hello", "ll"));
    }

    @Test
    void test_example2() {
        assertEquals(-1, underTest.strStr("aaaaa", "bba"));
    }
}
