package com.druidkuma.leetcode.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/24/22
 */
class LowestCommonAncestorOfABinaryTreeTest {

    private final LowestCommonAncestorOfABinaryTree underTest = new LowestCommonAncestorOfABinaryTree();

    @Test
    void test_example1() {
        TreeNode left = new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4)));
        TreeNode right = new TreeNode(1, new TreeNode(0), new TreeNode(8));
        TreeNode root = new TreeNode(3, left, right);

        assertEquals(root, underTest.lowestCommonAncestor(root, left, right));
    }

    @Test
    void test_example2() {
        TreeNode leaf = new TreeNode(4);
        TreeNode left = new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), leaf));
        TreeNode right = new TreeNode(1, new TreeNode(0), new TreeNode(8));
        TreeNode root = new TreeNode(3, left, right);

        assertEquals(left, underTest.lowestCommonAncestor(root, left, leaf));
    }

    @Test
    void test_example3() {
        TreeNode leaf = new TreeNode(2);
        TreeNode root = new TreeNode(1, null, leaf);

        assertEquals(root, underTest.lowestCommonAncestor(root, root, leaf));
    }

}
