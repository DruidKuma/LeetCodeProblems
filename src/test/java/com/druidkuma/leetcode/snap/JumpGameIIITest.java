package com.druidkuma.leetcode.snap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 28.10.2024
 */
class JumpGameIIITest {
    
    private final JumpGameIII underTest = new JumpGameIII();
    
    @Test
    void test_example1() {
        assertTrue(underTest.canReach(new int[] {4, 2, 3, 0, 3, 1, 2}, 5));
    }

    @Test
    void test_example2() {
        assertTrue(underTest.canReach(new int[] {4, 2, 3, 0, 3, 1, 2}, 0));
    }

    @Test
    void test_example3() {
        assertFalse(underTest.canReach(new int[] {3, 0, 2, 1, 2}, 2));
    }

}