package com.druidkuma.leetcode.blind75;

import com.druidkuma.leetcode.blind75.array.ContainerWithMostWater;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 7/2/22
 */
class ContainerWithMostWaterTest {

    private final ContainerWithMostWater underTest = new ContainerWithMostWater();

    @Test
    void test_example1() {
        assertEquals(49, underTest.maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    void test_example2() {
        assertEquals(1, underTest.maxArea(new int[] {1, 1}));
    }

}
