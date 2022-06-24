package com.druidkuma.leetcode.binarytree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 297
 *
 * Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer,
 * or transmitted across a network connection link to be reconstructed later in the same or another computer environment.
 *
 * Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your serialization/deserialization algorithm should work.
 * You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.
 *
 * Clarification: The input/output format is the same as how LeetCode serializes a binary tree. You do not necessarily need to follow this format,
 * so please be creative and come up with different approaches yourself.
 */
public class SerializeAndDeserializeBinaryTree {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder result = new StringBuilder();
        buildString(root, result);
        return result.substring(0, result.length() - 1);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return buildTree(new LinkedList<>(Arrays.asList(data.split(","))));
    }

    private void buildString(TreeNode root, StringBuilder result) {
        if (root == null) {
            result.append("null,");
            return;
        }
        result.append(root.val).append(",");
        buildString(root.left, result);
        buildString(root.right, result);
    }

    private TreeNode buildTree(List<String> nodeValues) {
        if (nodeValues.get(0).equals("null")) {
            nodeValues.remove(0);
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(nodeValues.get(0)));
        nodeValues.remove(0);
        root.left = buildTree(nodeValues);
        root.right = buildTree(nodeValues);
        return root;
    }
}
