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
class SortColorsTest {

    private final SortColors underTest = new SortColors();

    @Test
    void test_example1() {
        int[] arr = new int[] {0, 0, 1, 1, 2, 2};
        underTest.sortColors(arr);
        assertArrayEquals(new int[] {0, 0, 1, 1, 2, 2}, arr);
    }

    @Test
    void test_example2() {
        int[] arr = new int[] {2, 0, 1};
        underTest.sortColors(arr);
        assertArrayEquals(new int[] {0, 1, 2}, arr);
    }

}
