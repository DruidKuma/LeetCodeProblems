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
class DivideChocolateTest {
    
    private final DivideChocolate underTest = new DivideChocolate();
    
    @Test
    void test_example1() {
        assertEquals(underTest.maximizeSweetness(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, 5), 6);
    }

    @Test
    void test_example2() {
        assertEquals(underTest.maximizeSweetness(new int[] {5, 6, 7, 8, 9, 1, 2, 3, 4}, 8), 1);
    }

    @Test
    void test_example3() {
        assertEquals(underTest.maximizeSweetness(new int[] {1, 2, 2, 1, 2, 2, 1, 2, 2}, 2), 5);
    }

}