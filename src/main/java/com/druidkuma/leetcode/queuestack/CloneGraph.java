package com.druidkuma.leetcode.queuestack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 133
 *
 * Given a reference of a node in a connected undirected graph.
 *
 * Return a deep copy (clone) of the graph.
 *
 * Each node in the graph contains a value (int) and a list (List[Node]) of its neighbors.
 */
public class CloneGraph {
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        Map<Integer, Node> cloneNodes = new HashMap<>();
        return dfs(node, cloneNodes);
    }

    private Node dfs(Node node, Map<Integer, Node> cloneNodes) {
        if (!cloneNodes.containsKey(node.val)) {
            Node clonedNode = new Node(node.val);
            cloneNodes.put(clonedNode.val, clonedNode);
            clonedNode.neighbors = node.neighbors.stream().map(neighboor -> dfs(neighboor, cloneNodes)).collect(Collectors.toList());
        }
        return cloneNodes.get(node.val);
    }

    public static class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}
