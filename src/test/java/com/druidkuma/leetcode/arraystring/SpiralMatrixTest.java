package com.druidkuma.leetcode.arraystring;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/27/22
 */
class SpiralMatrixTest {

    private final SpiralMatrix underTest = new SpiralMatrix();

    @Test
    void test_example1() {
        assertEquals(List.of(1,2,3,6,9,8,7,4,5), underTest.spiralOrder(new int[][] {
                new int[] {1, 2, 3},
                new int[] {4, 5, 6},
                new int[] {7, 8, 9}
        }));
    }

    @Test
    void test_example2() {
        assertEquals(List.of(1,2,3,4,8,12,11,10,9,5,6,7), underTest.spiralOrder(new int[][] {
                new int[] {1, 2, 3, 4},
                new int[] {5, 6, 7, 8},
                new int[] {9, 10, 11, 12}
        }));
    }

}
