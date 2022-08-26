package com.druidkuma.leetcode.recursion;

import com.druidkuma.leetcode.binarytree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/24/22
 */
class SearchInABinarySearchTreeTest {

    private final SearchInABinarySearchTree underTest = new SearchInABinarySearchTree();

    @Test
    void test_example1() {
        TreeNode node = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        assertEquals(node, underTest.searchBST(new TreeNode(4, node, new TreeNode(7)), 2));
    }

    @Test
    void test_example2() {
        TreeNode node = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        assertNull(underTest.searchBST(new TreeNode(4, node, new TreeNode(7)), 5));
    }

}
