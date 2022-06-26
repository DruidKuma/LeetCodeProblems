package com.druidkuma.leetcode.trie;

import java.util.HashMap;
import java.util.Map;

/**
 * Design a data structure that supports adding new words and finding if a string matches any previously added string.
 *
 * Implement the WordDictionary class:
 *
 * WordDictionary() Initializes the object.
 * void addWord(word) Adds word to the data structure, it can be matched later.
 * bool search(word) Returns true if there is any string in the data structure that matches word or false otherwise. word may contain dots '.' where dots can be matched with any letter.
 */
public class DesignAddAndSearchWordsDataStructure {
    private TrieNode root;

    public DesignAddAndSearchWordsDataStructure() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode cur = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!cur.node.containsKey(ch)) {
                cur.node.put(ch, new TrieNode());
            }
            cur = cur.node.get(ch);
        }
        cur.word = true;
    }

    public boolean search(String word) {
        return search(word, root);
    }

    public boolean search(String word, TrieNode node) {
        TrieNode cur = node;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (cur.node.containsKey(c)) cur = cur.node.get(c);
            else {
                if (c == '.') {
                    for (Character key : cur.node.keySet()) {
                        if (search(word.substring(i + 1), cur.node.get(key))) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        return cur.word;
    }

    private static class TrieNode {
        private Map<Character, TrieNode> node;
        boolean word;

        public TrieNode() {
            this.node = new HashMap<>();
            this.word = false;
        }
    }
}
