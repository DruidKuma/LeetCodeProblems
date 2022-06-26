package com.druidkuma.leetcode.trie;

import java.util.HashMap;
import java.util.Map;

/**
 * 208
 *
 * A trie (pronounced as "try") or prefix tree is a tree data structure used to efficiently store and retrieve keys in a dataset of strings.
 * There are various applications of this data structure, such as autocomplete and spellchecker.
 *
 * Implement the Trie class:
 *
 * Trie() Initializes the trie object.
 * void insert(String word) Inserts the string word into the trie.
 * boolean search(String word) Returns true if the string word is in the trie (i.e., was inserted before), and false otherwise.
 * boolean startsWith(String prefix) Returns true if there is a previously inserted string word that has the prefix prefix, and false otherwise.
 */
public class ImplementTrie {

    private TrieNode root;

    public ImplementTrie() {
        root = new TrieNode(false);
    }

    public void insert(String word) {
        TrieNode cur = root;
        for (int i = 0; i < word.length(); i++) {
            if (!cur.node.containsKey(word.charAt(i))) {
                cur.node.put(word.charAt(i), new TrieNode(false));
            }
            cur = cur.node.get(word.charAt(i));
        }
        cur.word = true;
    }

    public boolean search(String word) {
        TrieNode cur = root;
        for (int i = 0; i < word.length(); i++) {
            if (!cur.node.containsKey(word.charAt(i))) return false;
            cur = cur.node.get(word.charAt(i));
        }
        return cur.word;
    }

    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        for (int i = 0; i < prefix.length(); i++) {
            if (!cur.node.containsKey(prefix.charAt(i))) return false;
            cur = cur.node.get(prefix.charAt(i));
        }
        return true;
    }

    private static class TrieNode {
        private boolean word;
        private Map<Character, TrieNode> node;

        public TrieNode(boolean word) {
            this.word = word;
            this.node = new HashMap<>();
        }
    }
}
