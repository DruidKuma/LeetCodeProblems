package com.druidkuma.leetcode.spotify;

import com.druidkuma.leetcode.binarytree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 7/3/22
 */
class BalancedBinaryTreeTest {

    private final BalancedBinaryTree underTest = new BalancedBinaryTree();

    @Test
    void test_example1() {
        assertTrue(underTest.isBalanced(new TreeNode(4, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
    }

    @Test
    void test_example2() {
        assertFalse(underTest.isBalanced(new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)), new TreeNode(2))));
    }
}
