package com.druidkuma.leetcode.queuestack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/19/22
 */
class MovingAverageFromDataStreamTest {

    @Test
    void test_example1() {
        MovingAverageFromDataStream movingAverage = new MovingAverageFromDataStream(3);
        assertEquals(1.0d, movingAverage.next(1));
        assertEquals(5.5d, movingAverage.next(10)); // return 5.5 = (1 + 10) / 2
        assertEquals(4.666666666666667d, movingAverage.next(3));
        assertEquals(6.0d, movingAverage.next(5));
    }
}
