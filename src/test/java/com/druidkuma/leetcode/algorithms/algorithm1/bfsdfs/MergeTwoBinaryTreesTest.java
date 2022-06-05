package com.druidkuma.leetcode.algorithms.algorithm1.bfsdfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.druidkuma.leetcode.algorithms.algorithm1.bfsdfs.MergeTwoBinaryTrees.TreeNode;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/5/22
 */
class MergeTwoBinaryTreesTest {

    private final MergeTwoBinaryTrees underTest = new MergeTwoBinaryTrees();

    @Test
    void test_example1() {
        assertEquals(
                new TreeNode(3, new TreeNode(4, new TreeNode(5), new TreeNode(4)), new TreeNode(5, null, new TreeNode(7))),
                underTest.mergeTrees(
                        new TreeNode(1, new TreeNode(3, new TreeNode(5), null), new TreeNode(2)),
                        new TreeNode(2, new TreeNode(1, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(7)))
                ));
    }

    @Test
    void test_example2() {
        assertEquals(
                new TreeNode(2, new TreeNode(2), null),
                underTest.mergeTrees(
                        new TreeNode(1),
                        new TreeNode(1, new TreeNode(2), null)
                ));
    }
}
