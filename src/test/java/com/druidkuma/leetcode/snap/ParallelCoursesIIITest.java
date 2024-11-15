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
class ParallelCoursesIIITest {
    
    private final ParallelCoursesIII underTest = new ParallelCoursesIII();
    
    @Test
    void test_example1() {
        var actual = underTest.minimumTime(3, new int[][] {new int[] {1, 3}, new int[] {2, 3}}, new int[] {3, 2, 5});
        assertEquals(actual, 8);
    }

    @Test
    void test_example2() {
        var actual = underTest.minimumTime(5, new int[][] {new int[] {1, 5}, new int[] {2, 5}, new int[] {3, 5}, new int[] {3, 4}, new int[] {4, 5}}, new int[] {1, 2, 3, 4, 5});
        assertEquals(actual, 12);
    }
}