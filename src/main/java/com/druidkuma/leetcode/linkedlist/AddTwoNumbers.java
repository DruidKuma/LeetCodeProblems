package com.druidkuma.leetcode.linkedlist;

/**
 * 2
 *
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    //will work only for numbers that fit into long range
    public ListNode addTwoNumbersMath(ListNode l1, ListNode l2) {
        return convertIntoList(convertIntoNumber(l1) + convertIntoNumber(l2));
    }

    private long convertIntoNumber(ListNode node) {
        long multiplier = 1;
        long result = 0;
        while (node != null) {
            result += Integer.valueOf(node.val).longValue() * multiplier;
            multiplier *= 10;
            node = node.next;
        }
        return result;
    }

    private ListNode convertIntoList(long number) {
        ListNode dummy = new ListNode(0);
        if (number == 0) return dummy;

        ListNode cur = dummy;
        while (number > 0) {
            long digit = number % 10;
            number = number / 10;
            cur.next = new ListNode(Long.valueOf(digit).intValue());
            cur = cur.next;
        }
        return dummy.next;
    }
}
