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
class OddEvenLinkedListTest {

    private final OddEvenLinkedList underTest = new OddEvenLinkedList();

    @Test
    void test_example1() {
        assertEquals(new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(2, new ListNode(4))))),
                underTest.oddEvenList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))));
    }

    @Test
    void test_example2() {
        assertEquals(new ListNode(2, new ListNode(3, new ListNode(6, new ListNode(7, new ListNode(1, new ListNode(5, new ListNode(4))))))),
                underTest.oddEvenList(new ListNode(2, new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(7)))))))));
    }

    @Test
    void test_example3() {
        assertEquals(new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(7, new ListNode(2, new ListNode(4, new ListNode(6, new ListNode(8)))))))),
                underTest.oddEvenList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(8))))))))));
    }
}
