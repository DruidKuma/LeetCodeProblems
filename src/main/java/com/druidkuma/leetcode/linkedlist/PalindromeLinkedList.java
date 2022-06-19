package com.druidkuma.leetcode.linkedlist;

/**
 * 234
 *
 * Given the head of a singly linked list, return true if it is a palindrome.
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;

        ListNode endOfFirstHalf = findEndOfFirstHalf(head);
        ListNode secondHalfStart = reverseList(endOfFirstHalf.next);

        ListNode firstHalfPointer = head;
        ListNode secondHalfPointer = secondHalfStart;
        boolean result = true;
        while (result && secondHalfPointer != null) {
            if (firstHalfPointer.val != secondHalfPointer.val) result = false;
            firstHalfPointer = firstHalfPointer.next;
            secondHalfPointer = secondHalfPointer.next;
        }
        endOfFirstHalf.next = reverseList(secondHalfStart);
        return result;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    private ListNode findEndOfFirstHalf(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
