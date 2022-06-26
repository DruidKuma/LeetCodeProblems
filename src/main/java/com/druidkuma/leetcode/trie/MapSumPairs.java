package com.druidkuma.leetcode.trie;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * 677
 *
 * Design a map that allows you to do the following:
 *
 * Maps a string key to a given value.
 * Returns the sum of the values that have a key with a prefix equal to a given string.
 * Implement the MapSum class:
 *
 * MapSum() Initializes the MapSum object.
 * void insert(String key, int val) Inserts the key-val pair into the map. If the key already existed, the original key-value pair will be overridden to the new one.
 * int sum(string prefix) Returns the sum of all the pairs' value whose key starts with the prefix.
 */
public class MapSumPairs {

    private static class TrieNode {
        private int sum;
        private Map<Character, TrieNode> node;

        public TrieNode() {
            this.sum = 0;
            this.node = new HashMap<>();
        }
    }

    private TrieNode root;

    public MapSumPairs() {
        root = new TrieNode();
    }

    public void insert(String key, int val) {
        TrieNode cur = root;
        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);
            if (!cur.node.containsKey(ch)) {
                cur.node.put(ch, new TrieNode());
            }
            cur = cur.node.get(ch);
        }
        cur.sum = val;
    }

    public int sum(String prefix) {
        TrieNode cur = root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            if (!cur.node.containsKey(ch)) {
                return 0;
            }
            cur = cur.node.get(ch);
        }

        Queue<TrieNode> queue = new LinkedList<>();
        queue.offer(cur);
        int sum = 0;
        while(!queue.isEmpty()) {
            TrieNode node = queue.poll();
            sum += node.sum;
            if (!node.node.isEmpty()) {
                queue.addAll(node.node.values());
            }
        }
        return sum;
    }
}
