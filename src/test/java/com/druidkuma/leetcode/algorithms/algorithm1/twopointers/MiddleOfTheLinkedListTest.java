package com.druidkuma.leetcode.algorithms.algorithm1.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.druidkuma.leetcode.algorithms.algorithm1.twopointers.MiddleOfTheLinkedList.ListNode;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/3/22
 */
class MiddleOfTheLinkedListTest {

    private final MiddleOfTheLinkedList underTest = new MiddleOfTheLinkedList();

    @Test
    void test_example1() {
        ListNode result = new ListNode(3, new ListNode(4, new ListNode(5)));
        assertEquals(result, underTest.middleNode(new ListNode(1, new ListNode(2, result))));
    }

    @Test
    void test_example2() {
        ListNode result = new ListNode(4, new ListNode(5, new ListNode(6)));
        assertEquals(result, underTest.middleNode(new ListNode(1, new ListNode(2, new ListNode(3, result)))));
    }
}
