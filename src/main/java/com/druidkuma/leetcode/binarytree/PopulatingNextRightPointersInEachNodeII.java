package com.druidkuma.leetcode.binarytree;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 117
 *
 * Given a binary tree
 *
 * struct Node {
 *   int val;
 *   Node *left;
 *   Node *right;
 *   Node *next;
 * }
 *
 * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
 *
 * Initially, all next pointers are set to NULL.
 */
public class PopulatingNextRightPointersInEachNodeII {
    public Node connect(Node root) {
        if (root == null) return null;

        Queue<Node> queue = new LinkedList<>() {{ offer(root); }};
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node source = queue.poll();
                if (i < size - 1) {
                    source.next = queue.peek();
                }
                if (source.left != null) queue.offer(source.left);
                if (source.right != null) queue.offer(source.right);
            }
        }
        return root;
    }

    @EqualsAndHashCode
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node(int _val) {
            val = _val;
        }
    };
}
