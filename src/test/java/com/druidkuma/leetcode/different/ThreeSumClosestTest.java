package com.druidkuma.leetcode.different;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/1/22
 */
class ThreeSumClosestTest {

    private final ThreeSumClosest underTest = new ThreeSumClosest();

    @Test
    void test_example1() {
        assertEquals(2, underTest.threeSumClosest(new int[] {-1, 2, 1, -4}, 1));
    }

    @Test
    void test_example2() {
        assertEquals(0, underTest.threeSumClosest(new int[] {0, 0, 0}, 1));
    }

    @Test
    void test_example3() {
        assertEquals(3, underTest.threeSumClosest(new int[] {1, 1, 1, 0}, 100));
    }

    @Test
    void test_example4() {
        assertEquals(2, underTest.threeSumClosest(new int[] {1, 1, 1, 0}, -100));
    }

    @Test
    void test_example5() {
        assertEquals(0, underTest.threeSumClosest(new int[] {0, 2, 1, -3}, 1));
    }

    @Test
    void test_example6() {
        assertEquals(-1, underTest.threeSumClosest(new int[] {1, 1, -1, -1, 3}, -1));
    }
}
