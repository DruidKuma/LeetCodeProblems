package com.druidkuma.leetcode.spotify;

import java.util.HashSet;
import java.util.Set;

/**
 * 1650
 *
 * TODO: write test for this class
 * Given two nodes of a binary tree p and q, return their lowest common ancestor (LCA).
 *
 * Each node will have a reference to its parent node. The definition for Node is below:
 *
 * class Node {
 *     public int val;
 *     public Node left;
 *     public Node right;
 *     public Node parent;
 * }
 * According to the definition of LCA on Wikipedia: "The lowest common ancestor of two nodes p and q in a tree T is the lowest node that has both p and q as descendants
 * (where we allow a node to be a descendant of itself)."
 */
public class LowestCommonAncestorOfABinaryTreeIII {

    public Node lowestCommonAncestor(Node p, Node q) {
        Node a = p, b = q;
        while (a != b) {
            a = a == null? q : a.parent;
            b = b == null? p : b.parent;
        }
        return a;
    }

    public Node lowestCommonAncestorSet(Node p, Node q) {
        Set<Node> parents = new HashSet<>();

        while (p != null) {
            parents.add(p);
            p = p.parent;
        }
        while (!parents.contains(q)) {
            q = q.parent;
        }

        return q;
    }

    public Node lowestCommonAncestorSetOptimized(Node p, Node q) {
        Set<Node> parents = new HashSet<>();
        while (true) {
            if (p != null) {
                if (parents.contains(p)) {
                    return p;
                }
                parents.add(p);
                p = p.parent;
            }
            if (q != null) {
                if (parents.contains(q)) {
                    return q;
                }
                parents.add(q);
                q = q.parent;
            }
        }
    }

    private static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node parent;
    }
}
