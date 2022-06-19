package com.druidkuma.leetcode.linkedlist;

/**
 * 203
 *
 * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode newHead = new ListNode(0, head);

        ListNode dummy = newHead;
        ListNode next = dummy.next;
        while (next != null) {
            if (next.val == val) dummy.next = next.next;
            else dummy = dummy.next;

            next = next.next;
        }

        return newHead.next;
    }
}
