package com.druidkuma.leetcode.different;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 21
 *
 * You are given the heads of two sorted linked lists list1 and list2.
 *
 * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
 *
 * Return the head of the merged linked list.
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        else if (list2 == null) return list1;
        else if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
        else {
            list2.next = mergeTwoLists(list2.next, list1);
            return list2;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        // Priority Queue (Min-Heap) to store nodes based on value
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(Comparator.comparingInt(node -> node.val));

        // Add the head of each list to the heap
        for (ListNode list : lists) {
            if (list != null) {
                minHeap.add(list);
            }
        }

        // Dummy node to start building the merged list
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // While the heap is not empty, process nodes
        while (!minHeap.isEmpty()) {
            // Get the smallest node
            ListNode smallestNode = minHeap.poll();
            current.next = smallestNode; // Add it to the merged list
            current = current.next;

            // Move to the next node in the list and add to the heap if not null
            if (smallestNode.next != null) {
                minHeap.add(smallestNode.next);
            }
        }

        return dummy.next; // Return merged list, skipping the dummy node
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
