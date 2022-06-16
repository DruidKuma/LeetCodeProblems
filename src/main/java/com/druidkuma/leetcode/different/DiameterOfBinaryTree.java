package com.druidkuma.leetcode.different;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

/**
 * 543
 *
 * Given the root of a binary tree, return the length of the diameter of the tree.
 *
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
 *
 * The length of a path between two nodes is represented by the number of edges between them.
 */
public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        int result = 0;
        Map<TreeNode, Integer> memo = new HashMap<>();
        while (root != null) {
            int left = getOrMemo(root.left, memo);
            int right = getOrMemo(root.right, memo);

            result = Math.max(result, left + right);
            root = left >= right ? root.left : root.right;
        }

        return result;
    }

    private int maxDepth(TreeNode node, Map<TreeNode, Integer> memo) {
        if (node == null) return 0;
        return 1 + Math.max(getOrMemo(node.left, memo), getOrMemo(node.right, memo));
    }

    private int getOrMemo(TreeNode node, Map<TreeNode, Integer> memo) {
        Integer value = memo.get(node);
        if (value == null) {
            value = maxDepth(node, memo);
            memo.put(node, value);
        }
        return value;
    }

    @EqualsAndHashCode
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
    }
}
