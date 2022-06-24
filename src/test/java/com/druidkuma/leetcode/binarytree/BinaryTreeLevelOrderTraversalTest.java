package com.druidkuma.leetcode.binarytree;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/24/22
 */
class BinaryTreeLevelOrderTraversalTest {

    private final BinaryTreeLevelOrderTraversal underTest = new BinaryTreeLevelOrderTraversal();

    @Test
    void test_example1() {
        assertEquals(Arrays.asList(List.of(3), List.of(9, 20), List.of(15, 7)),
                underTest.levelOrder(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
    }

    @Test
    void test_example2() {
        assertEquals(List.of(), underTest.levelOrder(null));
    }

    @Test
    void test_example3() {
        assertEquals(List.of(List.of(1)), underTest.levelOrder(new TreeNode(1)));
    }

}
