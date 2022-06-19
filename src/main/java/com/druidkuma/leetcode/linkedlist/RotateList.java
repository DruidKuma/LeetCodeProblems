package com.druidkuma.leetcode.linkedlist;

/**
 * 61
 *
 * Given the head of a linked list, rotate the list to the right by k places.
 */
public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) return head;
        int size = size(head);
        int numShifts = k % size;
        if (numShifts == 0) return head;

        int lastElement = size - numShifts;

        ListNode prev = null;
        ListNode cur = head;
        while (lastElement > 0) {
            prev = cur;
            cur = cur.next;
            lastElement--;
        }
        prev.next = null;

        ListNode newHead = cur;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = head;

        return newHead;
    }

    private int size(ListNode head) {
        int counter = 1;
        while (head != null) {
            head = head.next;
            counter++;
        }
        return counter - 1;
    }
}
