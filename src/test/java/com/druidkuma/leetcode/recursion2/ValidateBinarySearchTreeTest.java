package com.druidkuma.leetcode.recursion2;

import com.druidkuma.leetcode.binarytree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/30/22
 */
class ValidateBinarySearchTreeTest {

    private final ValidateBinarySearchTree underTest = new ValidateBinarySearchTree();

    @Test
    void test_example1() {
        assertTrue(underTest.isValidBST(new TreeNode(2, new TreeNode(1), new TreeNode(3))));
    }

    @Test
    void test_example2() {
        assertFalse(underTest.isValidBST(new TreeNode(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6)))));
    }

}
