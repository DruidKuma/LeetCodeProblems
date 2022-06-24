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
class SerializeAndDeserializeBinaryTreeTest {

    @Test
    void test_example() {
        SerializeAndDeserializeBinaryTree ser = new SerializeAndDeserializeBinaryTree();
        SerializeAndDeserializeBinaryTree deser = new SerializeAndDeserializeBinaryTree();

        TreeNode root1 = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        TreeNode root2 = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4, new TreeNode(6), new TreeNode(7)), new TreeNode(5)));

        assertEquals(root1, deser.deserialize(ser.serialize(root1)));
        assertEquals(root2, deser.deserialize(ser.serialize(root2)));
    }

}
