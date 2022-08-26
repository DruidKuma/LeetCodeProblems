package com.druidkuma.leetcode.recursion;

import com.druidkuma.leetcode.linkedlist.ListNode;

/**
 * 24
 *
 * Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
 */
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode second = head.next;
        ListNode third = head.next.next;
        second.next = head;
        head.next = swapPairs(third);
        return second;
    }
}
