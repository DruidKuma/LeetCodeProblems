package com.druidkuma.leetcode.linkedlist;

/**
 * 328
 *
 * Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
 *
 * The first node is considered odd, and the second node is even, and so on.
 *
 * Note that the relative order inside both the even and odd groups should remain as it was in the input.
 *
 * You must solve the problem in O(1) extra space complexity and O(n) time complexity.
 */
public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode firstEven = head;
        ListNode firstOdd = head.next;
        ListNode oddCursor = head.next;
        while (firstEven.next != null && oddCursor.next != null) {
            firstEven.next = firstEven.next.next;
            firstEven = firstEven.next;

            oddCursor.next = oddCursor.next.next;
            oddCursor = oddCursor.next;
        }
        firstEven.next = firstOdd;

        return head;
    }
}
