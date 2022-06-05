package com.druidkuma.leetcode.algorithms.algorithm1.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/4/22
 */
class PermutationInStringTest {

    private final PermutationInString underTest = new PermutationInString();

    @Test
    void test_example1() {
        assertTrue(underTest.checkInclusion("ab", "eidbaooo"));
    }

    @Test
    void test_example2() {
        assertFalse(underTest.checkInclusion("ab", "eidboaoo"));
    }

    @Test
    void testOneLetter() {
        assertTrue(underTest.checkInclusion("a", "a"));
    }

}
