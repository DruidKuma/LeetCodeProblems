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
class LongestSquareStreakInAnArrayTest {
    
    private final LongestSquareStreakInAnArray underTest = new LongestSquareStreakInAnArray();
    
    @Test
    void test_example1() {
        var actual = underTest.longestSquareStreak(new int[] {4, 3, 6, 16, 8, 2});
        assertEquals(actual, 3);
    }

    @Test
    void test_example2() {
        var actual = underTest.longestSquareStreak(new int[] {2, 3, 5, 6, 7});
        assertEquals(actual, -1);
    }

    @Test
    void test_example3() {
        var actual = underTest.longestSquareStreak(new int[] {3, 9, 81, 6561});
        assertEquals(actual, -1);
    }

}