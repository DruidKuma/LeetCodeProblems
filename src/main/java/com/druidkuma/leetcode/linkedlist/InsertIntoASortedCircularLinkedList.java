package com.druidkuma.leetcode.linkedlist;

/**
 * 708
 *
 * Given a Circular Linked List node, which is sorted in ascending order,
 * write a function to insert a value insertVal into the list such that it remains a sorted circular list.
 * The given node can be a reference to any single node in the list and may not necessarily be the smallest value in the circular list.
 *
 * If there are multiple suitable places for insertion, you may choose any place to insert the new value.
 * After the insertion, the circular list should remain sorted.
 *
 * If the list is empty (i.e., the given node is null), you should create a new single circular list and return the reference to that single node.
 * Otherwise, you should return the originally given node.
 */
public class InsertIntoASortedCircularLinkedList {
    public ListNode insert(ListNode head, int insertVal) {
        // 0 elements
        if (head == null) {
            ListNode node = new ListNode(insertVal);
            node.next = node;
            return node;
        }

        ListNode prev = head;
        ListNode cur = head.next;
        while (true) {
            if ((prev.val < insertVal && cur.val >= insertVal)
                    || cur == head
                    || (cur.val >= insertVal && prev.val > cur.val)
                    || (prev.val <= insertVal && prev.val > cur.val)) {
                prev.next = new ListNode(insertVal, cur);
                return head;
            }
            prev = cur;
            cur = cur.next;
        }
    }
}
