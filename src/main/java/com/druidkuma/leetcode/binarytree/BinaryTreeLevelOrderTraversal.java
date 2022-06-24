package com.druidkuma.leetcode.binarytree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 102
 *
 * Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level)
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        if (root != null) queue.offer(root);
        while(!queue.isEmpty()) {
            List<TreeNode> levelNodes = new ArrayList<>();
            while (!queue.isEmpty()) {
                levelNodes.add(queue.poll());
            }
            result.add(levelNodes.stream().map(node -> {
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
                return node.val;
            }).collect(Collectors.toList()));
        }
        return result;
    }
}
