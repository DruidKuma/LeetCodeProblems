package com.druidkuma.leetcode.queuestack;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/19/22
 */
class DesignCircularQueueTest {

    @Test
    void test_example1() {
        DesignCircularQueue myCircularQueue = new DesignCircularQueue(3);
        assertTrue(myCircularQueue.enQueue(1));
        assertTrue(myCircularQueue.enQueue(2));
        assertTrue(myCircularQueue.enQueue(3));
        assertFalse(myCircularQueue.enQueue(4));
        assertEquals(3, myCircularQueue.Rear());
        assertTrue(myCircularQueue.isFull());
        assertTrue(myCircularQueue.deQueue());
        assertTrue(myCircularQueue.enQueue(4));
        assertEquals(4, myCircularQueue.Rear());
    }

    @Test
    void test_example2() {
        DesignCircularQueue myCircularQueue = new DesignCircularQueue(6);
        assertTrue(myCircularQueue.enQueue(6));
        assertEquals(6, myCircularQueue.Rear());
        assertEquals(6, myCircularQueue.Rear());
        assertTrue(myCircularQueue.deQueue());
        assertTrue(myCircularQueue.enQueue(5));
        assertEquals(5, myCircularQueue.Rear());
        assertTrue(myCircularQueue.deQueue());
        assertEquals(-1, myCircularQueue.Front());
        assertFalse(myCircularQueue.deQueue());
        assertFalse(myCircularQueue.deQueue());
        assertFalse(myCircularQueue.deQueue());
    }

}
