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
class DeleteAndEarnTest {

    private final DeleteAndEarn underTest = new DeleteAndEarn();

    @Test
    void test_example1() {
        assertEquals(6, underTest.deleteAndEarn(new int[] {3, 4, 2}));
    }

    @Test
    void test_example2() {
        assertEquals(9, underTest.deleteAndEarn(new int[] {2, 2, 3, 3, 3, 4}));
    }

    @Test
    void test_example3() {
        assertEquals(43, underTest.deleteAndEarn(new int[] {1,6,3,3,8,4,8,10,1,3}));
    }
}
