package com.druidkuma.leetcode.binarytree;

import java.util.Arrays;

/**
 * 106
 *
 * Given two integer arrays inorder and postorder
 * where inorder is the inorder traversal of a binary tree and postorder is the postorder traversal of the same tree,
 * construct and return the binary tree.
 */
public class ConstructABinaryTreeFromInorderAndPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length == 0 || postorder.length == 0) return null;
        TreeNode root = new TreeNode(postorder[postorder.length - 1]);
        if(postorder.length == 1) return root;

        int index = 0;
        for(int val : inorder){
            if(val == root.val) break;
            index++;
        }

        root.left = buildTree(Arrays.copyOfRange(inorder, 0, index), Arrays.copyOfRange(postorder, 0, index));
        root.right = buildTree(Arrays.copyOfRange(inorder, index + 1, inorder.length), Arrays.copyOfRange(postorder, index, postorder.length - 1));

        return root;
    }
}
