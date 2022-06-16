package com.druidkuma.leetcode.different;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 206
 *
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode next = head.next;
        head.next = null;
        return reverse(head, next);
    }

    private ListNode reverse(ListNode current, ListNode next) {
        if (next == null) return current;
        ListNode nextElement = next.next;
        next.next = current;
        return reverse(next, nextElement);
    }

    public ListNode reverseListIteratively(ListNode head) {
        if (head == null) return null;
        ListNode next = head.next;
        ListNode current = head;
        head.next = null;
        while (next != null) {
            ListNode nextElement = next.next;
            next.next = current;
            current = next;
            next = nextElement;
        }
        return current;
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    @EqualsAndHashCode
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
}
