package com.druidkuma.leetcode.resursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/24/22
 */
class ReverseStringTest {

    private final ReverseString underTest = new ReverseString();

    @Test
    void test_example1() {
        assertArrayEquals(new char[] {'o','l','l','e','h'}, underTest.reverseString(new char[] {'h','e','l','l','o'}));
    }

    @Test
    void test_example2() {
        assertArrayEquals(new char[] {'h','a','n','n','a','H'}, underTest.reverseString(new char[] {'H','a','n','n','a','h'}));
    }
}
