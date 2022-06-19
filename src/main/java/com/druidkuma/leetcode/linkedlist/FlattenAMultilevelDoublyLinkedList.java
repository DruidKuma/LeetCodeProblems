package com.druidkuma.leetcode.linkedlist;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 430
 *
 * You are given a doubly linked list, which contains nodes that have a next pointer, a previous pointer, and an additional child pointer.
 * This child pointer may or may not point to a separate doubly linked list, also containing these special nodes.
 * These child lists may have one or more children of their own, and so on, to produce a multilevel data structure as shown in the example below.
 *
 * Given the head of the first level of the list, flatten the list so that all the nodes appear in a single-level, doubly linked list.
 * Let curr be a node with a child list. The nodes in the child list should appear after curr and before curr.next in the flattened list.
 *
 * Return the head of the flattened list. The nodes in the list must have all of their child pointers set to null.
 */
public class FlattenAMultilevelDoublyLinkedList {
    public Node flatten(Node head) {
        if (head == null) return null;
        Node cur = head;
        while (cur != null) {
            if (cur.child != null) {
                Node curNext = cur.next;

                Node child = flatten(cur.child);
                cur.next = child;
                child.prev = cur;

                cur.child = null;
                while (cur.next != null) {
                    cur = cur.next;
                }
                cur.next = curNext;
                if (curNext != null) curNext.prev = cur;
            }
            if (cur.next == null) return head;
            cur = cur.next;
        }

        return head;
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @ToString(exclude = {"prev", "child"})
    @EqualsAndHashCode(exclude = {"prev", "child"})
    public static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
            next.prev = this;
        }
    };
}
