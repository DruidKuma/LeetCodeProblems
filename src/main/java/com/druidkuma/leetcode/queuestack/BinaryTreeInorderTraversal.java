package com.druidkuma.leetcode.queuestack;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

/**
 * 94
 *
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 */
public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            values.add(cur.val);
            cur = cur.right;
        }
        return values;
    }


    public List<Integer> inorderTraversalRecursive(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        helper(root, values);
        return values;
    }

    private void helper(TreeNode root, List<Integer> values) {
        if (root == null) return;
        helper(root.left, values);
        values.add(root.val);
        helper(root.right, values);
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    @ToString
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
    }
}
