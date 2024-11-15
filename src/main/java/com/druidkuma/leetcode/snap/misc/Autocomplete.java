package com.druidkuma.leetcode.snap.misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    boolean isEndOfWord;

    TrieNode() {
        this.isEndOfWord = false;
    }
}

class Trie {
    private final TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Insert a word into the Trie
    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            node.children.putIfAbsent(c, new TrieNode());
            node = node.children.get(c);
        }
        node.isEndOfWord = true;
    }

    // Find words that start with the given prefix
    public List<String> autocomplete(String prefix) {
        TrieNode node = root;
        List<String> results = new ArrayList<>();

        // Traverse the Trie to the end of the prefix
        for (char c : prefix.toCharArray()) {
            node = node.children.get(c);
            if (node == null) {
                return results; // If prefix is not found, return empty list
            }
        }

        // Perform DFS from the end of the prefix to find all words
        dfs(node, prefix, results);
        return results;
    }

    // Helper function for DFS traversal to collect all words
    private void dfs(TrieNode node, String prefix, List<String> results) {
        if (node.isEndOfWord) {
            results.add(prefix);
        }
        for (char c : node.children.keySet()) {
            dfs(node.children.get(c), prefix + c, results);
        }
    }
}

public class Autocomplete {
    public static void main(String[] args) {
        Trie trie = new Trie();
        
        // Insert words into the Trie
        trie.insert("apple");
        trie.insert("app");
        trie.insert("apricot");
        trie.insert("banana");
        trie.insert("bat");
        trie.insert("ball");
        
        // Test autocomplete
        String prefix = "ap";
        List<String> completions = trie.autocomplete(prefix);
        
        System.out.println("Autocomplete results for prefix \"" + prefix + "\": " + completions);
    }
}
