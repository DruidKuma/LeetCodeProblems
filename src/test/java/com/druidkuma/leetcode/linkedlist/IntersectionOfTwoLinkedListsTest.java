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
class IntersectionOfTwoLinkedListsTest {

    private IntersectionOfTwoLinkedLists underTest = new IntersectionOfTwoLinkedLists();

    @Test
    void test_example1() {
        ListNode thirdPart = new ListNode(8, new ListNode(4, new ListNode(5)));
        ListNode headA = new ListNode(4, new ListNode(1, thirdPart));
        ListNode headB = new ListNode(5, new ListNode(6, new ListNode(1, thirdPart)));

        assertEquals(thirdPart, underTest.getIntersectionNode(headA, headB));
    }

    @Test
    void test_example2() {
        ListNode thirdPart = new ListNode(2, new ListNode(4));
        ListNode headA = new ListNode(1, new ListNode(9, new ListNode(1, thirdPart)));
        ListNode headB = new ListNode(3, thirdPart);

        assertEquals(thirdPart, underTest.getIntersectionNode(headA, headB));
    }

    @Test
    void test_example3() {
        ListNode headA = new ListNode(2, new ListNode(6, new ListNode(4)));
        ListNode headB = new ListNode(1, new ListNode(5));

        assertNull(underTest.getIntersectionNode(headA, headB));
    }

}
