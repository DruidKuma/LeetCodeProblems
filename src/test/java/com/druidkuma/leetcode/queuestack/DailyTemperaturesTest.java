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
class DailyTemperaturesTest {

    private final DailyTemperatures underTest = new DailyTemperatures();

    @Test
    void test_example1() {
        assertArrayEquals(new int[] {1, 1, 4, 2, 1, 1, 0, 0}, underTest.dailyTemperatures(new int[] {73, 74, 75, 71, 69, 72, 76, 73}));
    }

    @Test
    void test_example2() {
        assertArrayEquals(new int[] {1, 1, 1, 0}, underTest.dailyTemperatures(new int[] {30, 40, 50, 60}));
    }

    @Test
    void test_example3() {
        assertArrayEquals(new int[] {1, 1, 0}, underTest.dailyTemperatures(new int[] {30, 60, 90}));
    }
}
