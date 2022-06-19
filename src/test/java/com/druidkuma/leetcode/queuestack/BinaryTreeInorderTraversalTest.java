package com.druidkuma.leetcode.queuestack;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;
import static com.druidkuma.leetcode.queuestack.BinaryTreeInorderTraversal.TreeNode;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/19/22
 */
class BinaryTreeInorderTraversalTest {

    private final BinaryTreeInorderTraversal underTest = new BinaryTreeInorderTraversal();

    @Test
    void test_example1() {
        assertEquals(Arrays.asList(1, 3, 2), underTest.inorderTraversal(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null))));
    }

    @Test
    void test_example2() {
        assertEquals(Collections.emptyList(), underTest.inorderTraversal(null));
    }

    @Test
    void test_example3() {
        assertEquals(Collections.singletonList(1), underTest.inorderTraversal(new TreeNode(1)));
    }
}
