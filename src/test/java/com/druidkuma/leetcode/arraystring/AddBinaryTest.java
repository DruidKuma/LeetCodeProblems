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
class AddBinaryTest {

    private final AddBinary underTest = new AddBinary();

    @Test
    void test_example1() {
        assertEquals("100", underTest.addBinary("11", "1"));
    }

    @Test
    void test_example2() {
        assertEquals("10101", underTest.addBinary("1010", "1011"));
    }
}
