package com.druidkuma.leetcode.binarytree;

/**
 * 236
 *
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
 *
 * According to the definition of LCA on Wikipedia:
 * “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
 */
public class LowestCommonAncestorOfABinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode result = root;

        while (true) {
            if (isChild(result.left, p) && isChild(result.left, q)) {
                result = result.left;
            }
            else if (isChild(result.right, p) && isChild(result.right, q)) {
                result = result.right;
            }
            else break;
        }

        return result;
    }

    public boolean isChild(TreeNode first, TreeNode second) {
        if (first == null) return false;
        if (first == second) return true;
        return isChild(first.left, second) || isChild(first.right, second);
    }
}
