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
class PerfectSquaresTest {

    private final PerfectSquares underTest = new PerfectSquares();

    @Test
    void test_example1() {
        assertEquals(3, underTest.numSquares(12));
    }

    @Test
    void test_example2() {
        assertEquals(2, underTest.numSquares(13));
    }
}
