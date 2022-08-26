package com.druidkuma.leetcode.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/24/22
 */
class FibonacciNumberTest {

    private final FibonacciNumber underTest = new FibonacciNumber();

    @Test
    void test_example1() {
        assertEquals(1, underTest.fib(2));
    }

    @Test
    void test_example2() {
        assertEquals(2, underTest.fib(3));
    }

    @Test
    void test_example3() {
        assertEquals(3, underTest.fib(4));
    }
}
