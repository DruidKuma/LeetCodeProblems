package com.druidkuma.leetcode.arraystring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/28/22
 */
class MaxConsecutiveOnesTest {

    private final MaxConsecutiveOnes underTest = new MaxConsecutiveOnes();

    @Test
    void test_example1() {
        assertEquals(3, underTest.findMaxConsecutiveOnes(new int[] {1, 1, 0, 1, 1, 1}));
    }

    @Test
    void test_example2() {
        assertEquals(2, underTest.findMaxConsecutiveOnes(new int[] {1, 0, 1, 1, 0, 1}));
    }

}
