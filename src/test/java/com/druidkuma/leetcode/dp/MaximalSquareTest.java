package com.druidkuma.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/14/22
 */
class MaximalSquareTest {

    private final MaximalSquare underTest = new MaximalSquare();

    @Test
    void test_example1() {
        assertEquals(4, underTest.maximalSquare(new char[][] {
                new char[] {'1', '0', '1', '0', '0'},
                new char[] {'1', '0', '1', '1', '1'},
                new char[] {'1', '1', '1', '1', '1'},
                new char[] {'1', '0', '0', '1', '0'},
        }));
    }

    @Test
    void test_example2() {
        assertEquals(1, underTest.maximalSquare(new char[][] {
                new char[] {'0', '1'},
                new char[] {'1', '0'}
        }));
    }

    @Test
    void test_example3() {
        assertEquals(0, underTest.maximalSquare(new char[][] {
                new char[] {'0'},
        }));
    }

}
