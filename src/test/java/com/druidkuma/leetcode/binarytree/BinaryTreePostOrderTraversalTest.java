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
class BinaryTreePostOrderTraversalTest {

    private final BinaryTreePostOrderTraversal underTest = new BinaryTreePostOrderTraversal();

    @Test
    void test_example1() {
        assertEquals(Arrays.asList(3, 2, 1), underTest.postorderTraversal(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null))));
    }

    @Test
    void test_example2() {
        assertEquals(List.of(), underTest.postorderTraversal(null));
    }

    @Test
    void test_example3() {
        assertEquals(List.of(1), underTest.postorderTraversal(new TreeNode(1)));
    }

    @Test
    void test_example4() {
        assertEquals(Arrays.asList(1, 2, 3), underTest.postorderTraversal(new TreeNode(3, new TreeNode(1), new TreeNode(2))));
    }
}
