package com.druidkuma.leetcode.different;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/1/22
 */
class ThreeSumTest {

    private final ThreeSum underTest = new ThreeSum();

    @Test
    void test_example1() {
        assertEquals(Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1)), underTest.threeSum(new int[] {-1, 0, 1, 2, -1, -4}));
    }

    @Test
    void test_example2() {
        assertEquals(Collections.emptyList(), underTest.threeSum(new int[] {}));
    }

    @Test
    void test_example3() {
        assertEquals(Collections.emptyList(), underTest.threeSum(new int[] {0}));
    }

    @Test
    void test_example4() {
        assertEquals(Arrays.asList(Arrays.asList(0, 0, 0)), underTest.threeSum(new int[] {0, 0, 0, 0}));
    }

    @Test
    void test_example5() {
        assertEquals(Arrays.asList(Arrays.asList(-2, 0, 2), Arrays.asList(-2, 1, 1)), underTest.threeSum(new int[] {-2, 0, 1, 1, 2}));
    }

}
