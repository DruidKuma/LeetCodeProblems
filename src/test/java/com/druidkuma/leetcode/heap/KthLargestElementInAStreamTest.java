package com.druidkuma.leetcode.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/16/22
 */
class KthLargestElementInAStreamTest {

    @Test
    void test_example1() {
        KthLargestElementInAStream stream = new KthLargestElementInAStream(3, new int[]{4, 5, 8, 2});
        assertEquals(4, stream.add(3));
        assertEquals(5, stream.add(5));
        assertEquals(5, stream.add(10));
        assertEquals(8, stream.add(9));
        assertEquals(8, stream.add(4));
    }

}
