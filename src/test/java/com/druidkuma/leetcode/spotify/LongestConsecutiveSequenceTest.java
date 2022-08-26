package com.druidkuma.leetcode.spotify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 7/3/22
 */
class LongestConsecutiveSequenceTest {

    private final LongestConsecutiveSequence underTest = new LongestConsecutiveSequence();

    @Test
    void test_example1() {
        assertEquals(4, underTest.longestConsecutive(new int[] {100, 4, 200, 1, 3, 2}));
    }

    @Test
    void test_example2() {
        assertEquals(9, underTest.longestConsecutive(new int[] {0,3,7,2,5,8,4,6,0,1}));
    }

}
