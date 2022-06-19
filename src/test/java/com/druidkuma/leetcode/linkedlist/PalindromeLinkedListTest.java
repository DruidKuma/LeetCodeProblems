package com.druidkuma.leetcode.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/18/22
 */
class PalindromeLinkedListTest {

    private final PalindromeLinkedList underTest = new PalindromeLinkedList();

    @Test
    void test_example1() {
        assertTrue(underTest.isPalindrome(new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))))));
    }

    @Test
    void test_example2() {
        assertFalse(underTest.isPalindrome(new ListNode(1, new ListNode(2))));
    }
}
