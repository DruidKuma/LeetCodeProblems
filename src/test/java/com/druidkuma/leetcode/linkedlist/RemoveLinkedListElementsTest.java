package com.druidkuma.leetcode.linkedlist;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/17/22
 */
class RemoveLinkedListElementsTest {

    private final RemoveLinkedListElements underTest = new RemoveLinkedListElements();

    @Test
    void test_example1() {
        assertEquals(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
                underTest.removeElements(new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))))), 6));
    }

    @Test
    void test_example2() {
        assertNull(underTest.removeElements(null, 1));
    }

    @Test
    void test_example3() {
        assertNull(underTest.removeElements(new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7)))), 7));
    }

}
