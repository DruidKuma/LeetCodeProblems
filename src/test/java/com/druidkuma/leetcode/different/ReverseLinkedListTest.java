package com.druidkuma.leetcode.different;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.druidkuma.leetcode.different.ReverseLinkedList.ListNode;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/16/22
 */
class ReverseLinkedListTest {

    private final ReverseLinkedList underTest = new ReverseLinkedList();

    @Test
    void test_example1_recur() {
        assertEquals(
                new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1))))),
                underTest.reverseList(
                        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))));
    }

    @Test
    void test_example2_recur() {
        assertEquals(
                new ListNode(2, new ListNode(1)),
                underTest.reverseList(
                        new ListNode(1, new ListNode(2))));
    }

    @Test
    void test_example3_recur() {
        assertNull(underTest.reverseList(null));
    }

    @Test
    void test_example1_iter() {
        assertEquals(
                new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1))))),
                underTest.reverseListIteratively(
                        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))));
    }

    @Test
    void test_example2_iter() {
        assertEquals(
                new ListNode(2, new ListNode(1)),
                underTest.reverseListIteratively(
                        new ListNode(1, new ListNode(2))));
    }

    @Test
    void test_example3_iter() {
        assertNull(underTest.reverseListIteratively(null));
    }

}
