package com.druidkuma.leetcode.algorithms.algorithm1.twopointers;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 19
 *
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 */
public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode pointer = head;
        while (pointer != null) {
            size++;
            pointer = pointer.next;
        }
        if (size == 0 || (size == 1 && n == 1)) return null;
        else if (size == n) return head.next;

        int elementToRemoveIndex =  size - n;

        pointer = head;
        for (int i = 0; i < elementToRemoveIndex - 1; i++) {
            pointer = pointer.next;
        }
        pointer.next = pointer.next.next;

        return head;
    }

    @EqualsAndHashCode
    @ToString
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
}
