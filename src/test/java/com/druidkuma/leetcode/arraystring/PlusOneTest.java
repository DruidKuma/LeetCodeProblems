package com.druidkuma.leetcode.arraystring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/27/22
 */
class PlusOneTest {

    private final PlusOne underTest = new PlusOne();

    @Test
    void test_example1() {
        assertArrayEquals(new int[] {1, 2, 4}, underTest.plusOne(new int[] {1, 2, 3}));
    }

    @Test
    void test_example2() {
        assertArrayEquals(new int[] {4, 3, 2, 2}, underTest.plusOne(new int[] {4, 3, 2, 1}));
    }

    @Test
    void test_example3() {
        assertArrayEquals(new int[] {1, 0}, underTest.plusOne(new int[] {9}));
    }

}
