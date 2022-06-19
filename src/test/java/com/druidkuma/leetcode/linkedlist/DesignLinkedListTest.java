package com.druidkuma.leetcode.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/16/22
 */
class DesignLinkedListTest {

    @Test
    void test_example1() {
        DesignLinkedList list = new DesignLinkedList();
        list.addAtHead(1);
        list.addAtTail(3);
        list.addAtIndex(1, 2);
        assertEquals(2, list.get(1));
        list.deleteAtIndex(1);
        assertEquals(3, list.get(1));
    }

    @Test
    void test_example2() {
        DesignLinkedList list = new DesignLinkedList();
        list.addAtHead(1);
        list.addAtTail(3);
        list.addAtIndex(1, 2);
        assertEquals(2, list.get(1));
        list.deleteAtIndex(0);
        assertEquals(2, list.get(0));
    }

    @Test
    void test_example3() {
        DesignLinkedList list = new DesignLinkedList();
        list.addAtTail(1);
        assertEquals(1, list.get(0));
    }

    @Test
    void test_example4() {
        DesignLinkedList list = new DesignLinkedList();
        list.addAtHead(2);
        list.deleteAtIndex(1);
        list.addAtHead(2);
        list.addAtHead(7);
        list.addAtHead(3);
        list.addAtHead(2);
        list.addAtHead(5);
        list.addAtTail(5);
        assertEquals(2, list.get(5));
        list.deleteAtIndex(6);
        list.deleteAtIndex(4);
    }

    @Test
    void test_example5() {
        DesignLinkedList list = new DesignLinkedList();
        list.addAtHead(7);
        list.addAtHead(2);
        list.addAtHead(1);
        list.addAtIndex(3, 0);
        list.deleteAtIndex(2);
        list.addAtHead(6);
        list.addAtTail(4);
        assertEquals(4, list.get(4));
        list.addAtHead(4);
        list.addAtIndex(5, 0);
        list.addAtHead(6);
    }

    @Test
    void test_example6() {
        DesignLinkedList list = new DesignLinkedList();
        list.addAtIndex(1, 0);
        assertEquals(-1, list.get(0));
    }
}
