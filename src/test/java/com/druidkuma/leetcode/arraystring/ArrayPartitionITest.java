package com.druidkuma.leetcode.arraystring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/28/22
 */
class ArrayPartitionITest {

    private final ArrayPartitionI underTest = new ArrayPartitionI();

    @Test
    void test_example1() {
        assertEquals(4, underTest.arrayPairSum(new int[] {1, 4, 3, 2}));
    }

    @Test
    void test_example2() {
        assertEquals(9, underTest.arrayPairSum(new int[] {6, 2, 6, 5, 1, 2}));
    }

}
