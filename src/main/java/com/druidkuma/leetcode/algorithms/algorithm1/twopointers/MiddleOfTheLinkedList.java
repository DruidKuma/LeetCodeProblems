package com.druidkuma.leetcode.algorithms.algorithm1.twopointers;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 876
 *
 * Given the head of a singly linked list, return the middle node of the linked list.
 *
 * If there are two middle nodes, return the second middle node.
 */
public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode pointer = head;
        while (pointer != null) {
            size++;
            pointer = pointer.next;
        }

        int middle = size / 2;

        while (middle > 0) {
            head = head.next;
            middle--;
        }
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
