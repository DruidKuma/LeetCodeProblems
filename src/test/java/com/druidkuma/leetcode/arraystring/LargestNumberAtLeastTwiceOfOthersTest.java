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
class LargestNumberAtLeastTwiceOfOthersTest {

    private final LargestNumberAtLeastTwiceOfOthers underTest = new LargestNumberAtLeastTwiceOfOthers();

    @Test
    void test_example1() {
        assertEquals(1, underTest.dominantIndex(new int[] {3, 6, 1, 0}));
    }

    @Test
    void test_example2() {
        assertEquals(-1, underTest.dominantIndex(new int[] {1, 2, 3, 4}));
    }

    @Test
    void test_example3() {
        assertEquals(0, underTest.dominantIndex(new int[] {1}));
    }

}
