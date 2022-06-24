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
 * @since 6/19/22
 */
class BinaryTreePreorderTraversalTest {

    private final BinaryTreePreorderTraversal underTest = new BinaryTreePreorderTraversal();

    @Test
    void test_example1() {
        assertEquals(Arrays.asList(1, 2, 3), underTest.preorderTraversal(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null))));
    }

    @Test
    void test_example2() {
        assertEquals(List.of(), underTest.preorderTraversal(null));
    }

    @Test
    void test_example3() {
        assertEquals(List.of(1), underTest.preorderTraversal(new TreeNode(1)));
    }

    @Test
    void test_example4() {
        assertEquals(Arrays.asList(1, 4, 2, 3), underTest.preorderTraversal(new TreeNode(1, new TreeNode(4, new TreeNode(2), null), new TreeNode(3))));
    }

}
