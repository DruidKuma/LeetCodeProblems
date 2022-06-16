package com.druidkuma.leetcode.different;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.druidkuma.leetcode.different.MaximumDepthOfBinaryTree.TreeNode;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/5/22
 */
class MaximumDepthOfBinaryTreeTest {

    private final MaximumDepthOfBinaryTree underTest = new MaximumDepthOfBinaryTree();

    @Test
    void test_example1() {
        //[3,9,20,null,null,15,7]
        assertEquals(3, underTest.maxDepth(new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7))
        )));
    }

    @Test
    void test_example2() {
        //[1,null,2]
        assertEquals(2, underTest.maxDepth(new TreeNode(1, null, new TreeNode(2))));
    }
}
