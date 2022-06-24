package com.druidkuma.leetcode.binarytree;

/**
 * 105
 *
 * Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree
 * and inorder is the inorder traversal of the same tree, construct and return the binary tree.
 */
public class ConstructABinaryTreeFromPreorderAndInorderTraversal {
    int rootind=0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder,0,preorder.length-1);

    }

    private TreeNode build(int[] pre, int[] in, int ii, int ij){
        if(ii > ij) return null;

        TreeNode root = new TreeNode(pre[rootind]);
        int ind = search(in, pre[rootind], ii);

        rootind++;

        root.left = build(pre, in, ii,ind-1);
        root.right = build(pre, in,ind+1, ij);
        return root;
    }

    private int search(int[] in, int ele, int start){
        for(int i = start; i < in.length; i++){
            if(in[i] == ele) return i;
        }
        return -1;
    }
}
