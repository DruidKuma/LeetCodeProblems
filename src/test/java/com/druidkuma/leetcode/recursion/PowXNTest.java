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
class PowXNTest {

    private final PowXN underTest = new PowXN();

    @Test
    void test_example1() {
        assertEquals(1024.00000d, underTest.myPow(2.00000d, 10));
    }

    @Test
    void test_example2() {
        assertEquals(9.261000000000001, underTest.myPow(2.10000d, 3));
    }

    @Test
    void test_example3() {
        assertEquals(0.250000, underTest.myPow(2.00000d, -2));
    }

    @Test
    void test_example4() {
        assertEquals(1d, underTest.myPow(0.44528, 0));
    }

    @Test
    void test_example5() {
        assertEquals(1d, underTest.myPow(1.00000, -2147483648));
    }

}
