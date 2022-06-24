package com.druidkuma.leetcode.resursion;

import com.druidkuma.leetcode.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/24/22
 */
class SwapNodesInPairsTest {

    private final SwapNodesInPairs underTest = new SwapNodesInPairs();

    @Test
    void test_example1() {
        assertEquals(new ListNode(2, new ListNode(1, new ListNode(4, new ListNode(3, null)))),
                underTest.swapPairs(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))))));
    }

    @Test
    void test_example2() {
        assertNull(underTest.swapPairs(null));
    }

    @Test
    void test_example3() {
        assertEquals(new ListNode(1, null),
                underTest.swapPairs(new ListNode(1, null)));
    }

}
