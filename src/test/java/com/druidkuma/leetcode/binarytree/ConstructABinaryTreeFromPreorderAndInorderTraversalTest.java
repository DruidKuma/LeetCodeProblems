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
class ConstructABinaryTreeFromPreorderAndInorderTraversalTest {

    private final ConstructABinaryTreeFromPreorderAndInorderTraversal underTest = new ConstructABinaryTreeFromPreorderAndInorderTraversal();

    @Test
    void test_example1() {
        assertEquals(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))),
                underTest.buildTree(new int[] {3, 9, 20, 15, 7}, new int[] {9, 3, 15, 20, 7}));
    }

    @Test
    void test_example2() {
        assertEquals(new TreeNode(-1),
                underTest.buildTree(new int[] {-1}, new int[] {-1}));
    }

}
