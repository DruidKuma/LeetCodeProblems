package com.druidkuma.leetcode.linkedlist;

/**
 * 707
 *
 * Design your implementation of the linked list. You can choose to use a singly or doubly linked list.
 * A node in a singly linked list should have two attributes: val and next. val is the value of the current node, and next is a pointer/reference to the next node.
 * If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node in the linked list. Assume all nodes in the linked list are 0-indexed.
 *
 * Implement the MyLinkedList class:
 *
 * MyLinkedList() Initializes the MyLinkedList object.
 * int get(int index) Get the value of the indexth node in the linked list. If the index is invalid, return -1.
 * void addAtHead(int val) Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
 * void addAtTail(int val) Append a node of value val as the last element of the linked list.
 * void addAtIndex(int index, int val) Add a node of value val before the indexth node in the linked list. If index equals the length of the linked list, the node will be appended to the end of the linked list. If index is greater than the length, the node will not be inserted.
 * void deleteAtIndex(int index) Delete the indexth node in the linked list, if the index is valid.
 */
public class DesignLinkedList {
    Node head;
    int size;

    public DesignLinkedList() {
        size = 0;
        head = new Node();
    }

    public int get(int index) {
        if (index > size - 1) return -1;

        Node curElement = head.next;
        while (index > 0) {
            curElement = curElement.next;
            index--;
        }
        return curElement.val;
    }

    public void addAtHead(int val) {
        Node firstElement = head.next;
        head.next = new Node(val, firstElement);
        size++;
    }

    public void addAtTail(int val) {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(val);
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }

        Node prev = head;
        Node cur = head.next;
        for (int i = 0; i < index; i++) {
            prev = cur;
            cur = cur.next;
        }
        prev.next = new Node(val, cur);
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index > size - 1) return;
        Node prev = head;
        Node cur = head.next;
        for (int i = 0; i < index; i++) {
            prev = cur;
            cur = cur.next;
        }
        prev.next = cur.next;
        size--;
    }

    private static class Node {
        int val;
        Node next;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
