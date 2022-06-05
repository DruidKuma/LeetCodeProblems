package com.druidkuma.leetcode.algorithms.algorithm1.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.druidkuma.leetcode.algorithms.algorithm1.twopointers.RemoveNthNodeFromEndOfList.ListNode;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/4/22
 */
class RemoveNthNodeFromEndOfListTest {

    private final RemoveNthNodeFromEndOfList underTest = new RemoveNthNodeFromEndOfList();

    @Test
    void test_example1() {
        assertEquals(
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5)))),
                underTest.removeNthFromEnd(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 2)
        );
    }

    @Test
    void test_example2() {
        assertNull(underTest.removeNthFromEnd(new ListNode(1), 1));
    }

    @Test
    void test_example3() {
        assertEquals(new ListNode(1), underTest.removeNthFromEnd(new ListNode(1, new ListNode(2)), 1));
    }

    @Test
    void test_example4() {
        assertEquals(new ListNode(2), underTest.removeNthFromEnd(new ListNode(1, new ListNode(2)), 2));
    }

}
