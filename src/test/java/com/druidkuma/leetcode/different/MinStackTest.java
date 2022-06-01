package com.druidkuma.leetcode.different;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/1/22
 */
class MinStackTest {

    @Test
    void test_example1() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        assertEquals(-3, minStack.getMin());
        minStack.pop();
        assertEquals(0, minStack.top());    // return 0
        assertEquals(-2, minStack.getMin()); // return -2
    }

}
