package com.druidkuma.leetcode.binarytree;

/**
 * 104
 *
 * Given the root of a binary tree, return its maximum depth.
 *
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        return helper(root, 0);
    }

    public int helper(TreeNode root, int level) {
        if (root == null) return level;
        return Math.max(helper(root.left, level + 1), helper(root.right, level + 1));
    }
}
