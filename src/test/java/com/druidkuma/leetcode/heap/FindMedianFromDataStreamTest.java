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
class FindMedianFromDataStreamTest {

    @Test
    void test_example1() {
        FindMedianFromDataStream median = new FindMedianFromDataStream();
        median.addNum(1);
        median.addNum(2);
        assertEquals(1.5d, median.findMedian());
        median.addNum(3);
        assertEquals(2.0d, median.findMedian());
    }

    @Test
    void test_example2() {
        FindMedianFromDataStream median = new FindMedianFromDataStream();
        median.addNum(-1);
        assertEquals(-1.0d, median.findMedian());
        median.addNum(-2);
        assertEquals(-1.5d, median.findMedian());
        median.addNum(-3);
        assertEquals(-2.0d, median.findMedian());
        median.addNum(-4);
        assertEquals(-2.5d, median.findMedian());
        median.addNum(-5);
        assertEquals(-3.0d, median.findMedian());
    }
}
