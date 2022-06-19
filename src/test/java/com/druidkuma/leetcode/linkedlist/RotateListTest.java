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
class RotateListTest {

    private final RotateList underTest = new RotateList();

    @Test
    void test_example1() {
        assertEquals(new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(2, new ListNode(3))))),
                underTest.rotateRight(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 2));
    }

    @Test
    void test_example2() {
        assertEquals(new ListNode(2, new ListNode(0, new ListNode(1))),
                underTest.rotateRight(new ListNode(0, new ListNode(1, new ListNode(2))), 4));
    }

    @Test
    void test_example3() {
        assertEquals(new ListNode(2, new ListNode(1)),
                underTest.rotateRight(new ListNode(1, new ListNode(2)), 1));
    }

}
