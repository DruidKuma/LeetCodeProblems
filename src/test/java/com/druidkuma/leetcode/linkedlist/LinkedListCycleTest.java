package com.druidkuma.leetcode.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/17/22
 */
class LinkedListCycleTest {

    private final LinkedListCycle underTest = new LinkedListCycle();

    @Test
    void test_example1() {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;
        assertTrue(underTest.hasCycle(node1));
    }

    @Test
    void test_example2() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        node2.next = node1;
        assertTrue(underTest.hasCycle(node1));
    }

    @Test
    void test_example3() {
        ListNode node1 = new ListNode(1);
        assertFalse(underTest.hasCycle(node1));
    }
}
