package com.druidkuma.leetcode.recursion2;

import com.druidkuma.leetcode.binarytree.TreeNode;

/**
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 * <p>
 * A valid BST is defined as follows:
 * <p>
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 */
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return validate(root, null, null);
    }

    private boolean validate(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;
        return (min == null || root.val > min)
                && (max == null || root.val < max)
                && validate(root.left, min, root.val)
                && validate(root.right, root.val, max);
    }
}
