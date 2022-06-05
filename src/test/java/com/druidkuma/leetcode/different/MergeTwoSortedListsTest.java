package com.druidkuma.leetcode.different;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static com.druidkuma.leetcode.different.MergeTwoSortedLists.ListNode;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/2/22
 */
class MergeTwoSortedListsTest {

    private final MergeTwoSortedLists underTest = new MergeTwoSortedLists();

    @Test
    void test_example1() {
        assertEquals(
                new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4)))))), underTest.mergeTwoLists(
                        new ListNode(1, new ListNode(2, new ListNode(4))),
                        new ListNode(1, new ListNode(3, new ListNode(4)))));
    }

    @Test
    void test_example2() {
        assertNull(underTest.mergeTwoLists(null, null));
    }

    @Test
    void test_example3() {
        assertEquals(new ListNode(0), underTest.mergeTwoLists(null, new ListNode(0)));
    }

}
