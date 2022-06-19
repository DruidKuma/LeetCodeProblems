package com.druidkuma.leetcode.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * FIXME: Don not run these tests, they will always result in Stack Overflow. Fix equals in ListNode to handle circular lists
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/18/22
 */
class InsertIntoASortedCircularLinkedListTest {

    private final InsertIntoASortedCircularLinkedList underTest = new InsertIntoASortedCircularLinkedList();

    @Test
    void test_example1() {
        ListNode head = new ListNode(3);
        head.next = new ListNode(4, new ListNode(1, head));

        ListNode resultHead = new ListNode(3);
        resultHead.next = new ListNode(4, new ListNode(1, new ListNode(2, resultHead)));
        assertEquals(resultHead, underTest.insert(head, 2));
    }

}
