package com.druidkuma.leetcode.linkedlist;

/**
 * 142
 *
 * Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
 *
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.
 *
 * Do not modify the linked list.
 */
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return null;

        ListNode slow = head.next;
        ListNode fast = head.next.next;

        ListNode intersect = null;
        while (slow != null && fast != null) {
            if (slow == fast) {
                intersect = slow;
                break;
            }
            if (fast.next == null) return null;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (intersect == null) return null;

        ListNode ptr1 = head;
        ListNode ptr2 = intersect;

        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return ptr1;
    }
}
