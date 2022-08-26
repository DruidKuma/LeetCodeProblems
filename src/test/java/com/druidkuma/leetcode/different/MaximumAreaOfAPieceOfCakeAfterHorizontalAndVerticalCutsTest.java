package com.druidkuma.leetcode.different;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 7/3/22
 */
class MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCutsTest {

    private final MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts underTest = new MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts();

    @Test
    void test_example1() {
        assertEquals(4, underTest.maxArea(5, 4, new int[] {1, 2, 4}, new int[] {1, 3}));
    }

    @Test
    void test_example2() {
        assertEquals(9, underTest.maxArea(5, 4, new int[] {3}, new int[] {3}));
    }

    @Test
    void test_example3() {
        assertEquals(6, underTest.maxArea(8, 5, new int[] {5, 2, 6, 3}, new int[] {1, 4}));
    }

}
