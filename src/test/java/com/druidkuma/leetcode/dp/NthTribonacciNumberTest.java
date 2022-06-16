package com.druidkuma.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/12/22
 */
class NthTribonacciNumberTest {

    private final NthTribonacciNumber underTest = new NthTribonacciNumber();

    @Test
    void test_example1() {
        assertEquals(4, underTest.tribonacci(4));
    }

    @Test
    void test_example2() {
        assertEquals(1389537, underTest.tribonacci(25));
    }
}
