package com.druidkuma.leetcode.different;

import java.util.HashMap;
import java.util.Map;

/**
 * 146
 *
 * Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
 *
 * Implement the LRUCache class:
 *
 * LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
 *
 * int get(int key) Return the value of the key if the key exists, otherwise return -1.
 *
 * void put(int key, int value)
 * Update the value of the key if the key exists.
 * Otherwise, add the key-value pair to the cache.
 * If the number of keys exceeds the capacity from this operation, evict the least recently used key.
 *
 * The functions get and put must each run in O(1) average time complexity.
 */
public class LRUCache {
    private int size;
    private int capacity;
    private Map<Integer, DListNode> store;
    private DListNode head;
    private DListNode tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        store = new HashMap<>();

        head = new DListNode();
        tail = new DListNode();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!store.containsKey(key)) return -1;
        DListNode node = store.get(key);
        use(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (!store.containsKey(key)) {
            DListNode listNode = new DListNode();
            listNode.key = key;
            listNode.value = value;
            store.put(key, listNode);
            addNode(listNode);
            size++;

            if (size > capacity) {
                removeLeastUsed();
                size--;
            }
        }
        else {
            DListNode listNode = store.get(key);
            listNode.value = value;
            use(listNode);
        }
    }

    private void addNode(DListNode node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(DListNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void use(DListNode node) {
        removeNode(node);
        addNode(node);
    }

    private void removeLeastUsed() {
        DListNode deleted = tail.prev;
        removeNode(deleted);
        store.remove(deleted.key);
    }

    private static class DListNode {
        int key;
        int value;
        DListNode next;
        DListNode prev;
    }
}
