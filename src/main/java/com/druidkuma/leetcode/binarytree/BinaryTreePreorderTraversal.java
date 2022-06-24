package com.druidkuma.leetcode.binarytree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

/**
 * 144
 *
 * Given the root of a binary tree, return the preorder traversal of its nodes' values.
 */
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return Collections.emptyList();
        Deque<TreeNode> stack = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
        return result;
    }

    public List<Integer> preorderTraversalRecur(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        helper(root, values);
        return values;
    }

    private void helper(TreeNode node, List<Integer> values) {
        if (node == null) return;
        values.add(node.val);
        helper(node.left, values);
        helper(node.right, values);
    }
}
