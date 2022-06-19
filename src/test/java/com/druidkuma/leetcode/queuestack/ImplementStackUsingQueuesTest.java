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
class ImplementStackUsingQueuesTest {

    @Test
    void test_example1() {
        ImplementStackUsingQueues myStack = new ImplementStackUsingQueues();
        myStack.push(1);
        myStack.push(2);
        assertEquals(2, myStack.top());
        assertEquals(2, myStack.pop());
        assertFalse(myStack.empty());
    }
}
