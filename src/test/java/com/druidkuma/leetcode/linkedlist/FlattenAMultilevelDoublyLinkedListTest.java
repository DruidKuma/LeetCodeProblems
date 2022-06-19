package com.druidkuma.leetcode.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.druidkuma.leetcode.linkedlist.FlattenAMultilevelDoublyLinkedList.Node;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/18/22
 */
class FlattenAMultilevelDoublyLinkedListTest {

    private final FlattenAMultilevelDoublyLinkedList underTest = new FlattenAMultilevelDoublyLinkedList();

    @Test
    void test_example1() {
        Node node11 = new Node(11);
        Node node12 = new Node(12);
        node11.next = node12;
        node12.prev = node11;

        Node node7 = new Node(7);
        Node node8 = new Node(8);
        node7.next = node8;
        node8.prev = node7;

        Node node9 = new Node(9);
        node8.next = node9;
        node9.prev = node8;

        Node node10 = new Node(10);
        node9.next = node10;
        node10.prev = node9;

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node2.prev = node1;
        node1.next = node2;

        Node node3 = new Node(3);
        node2.next = node3;
        node3.prev = node2;

        Node node4 = new Node(4);
        node3.next = node4;
        node4.prev = node3;

        Node node5 = new Node(5);
        node5.prev = node4;
        node4.next = node5;

        Node node6 = new Node(6);
        node5.next = node6;
        node6.prev = node5;

        node3.child = node7;
        node8.child = node11;

        assertEquals(new Node(1, new Node(2, new Node(3, new Node(7, new Node(8, new Node(11, new Node(12, new Node(9, new Node(10, new Node(4, new Node(5, new Node(6)))))))))))), underTest.flatten(node1));
    }

    @Test
    void test_example2() {
        Node node1 = new Node(1, new Node(2));
        node1.child = new Node(3);

        assertEquals(new Node(1, new Node(3, new Node(2))), underTest.flatten(node1));
    }

    @Test
    void test_example3() {
        assertNull(underTest.flatten(null));
    }

    @Test
    void test_example4() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.child = node2;
        node2.child = node3;

        assertEquals(new Node(1, new Node(2, new Node(3))), underTest.flatten(node1));
    }

}
