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
class PathSumTest {

    private final PathSum underTest = new PathSum();

    @Test
    void test_example1() {
        assertTrue(underTest.hasPathSum(new TreeNode(5,
                new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
                new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1)))),
                22));
    }

    @Test
    void test_example2() {
        assertFalse(underTest.hasPathSum(new TreeNode(1, new TreeNode(2), new TreeNode(3)), 5));
    }

}
