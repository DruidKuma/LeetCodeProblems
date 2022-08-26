package com.druidkuma.leetcode.blind75.binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 7/3/22
 */
class SumOfTwoIntegersTest {

    private final SumOfTwoIntegers underTest = new SumOfTwoIntegers();

    @Test
    void test_example1() {
        assertEquals(3, underTest.getSum(1, 2));
    }

    @Test
    void test_example2() {
        assertEquals(5, underTest.getSum(2, 3));
    }

}
