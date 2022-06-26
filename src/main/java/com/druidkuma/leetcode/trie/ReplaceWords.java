package com.druidkuma.leetcode.trie;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * In English, we have a concept called root, which can be followed by some other word to form another longer word - let's call this word successor. For example, when the root "an" is followed by the successor word "other", we can form a new word "another".
 *
 * Given a dictionary consisting of many roots and a sentence consisting of words separated by spaces, replace all the successors in the sentence with the root forming it. If a successor can be replaced by more than one root, replace it with the root that has the shortest length.
 *
 * Return the sentence after the replacement.
 */
public class ReplaceWords {

    private static class Trie {
        private TrieNode root;

        Trie(List<String> dict) {
            root = new TrieNode();
            dict.forEach(this::insert);
        }

        void insert(String key) {
            TrieNode cur = root;
            for (int i = 0; i < key.length(); i++) {
                if(!cur.node.containsKey(key.charAt(i))) {
                    cur.node.put(key.charAt(i), new TrieNode());
                }
                cur = cur.node.get(key.charAt(i));
            }
            cur.isWord = true;
        }

        String findPrefix(String word) {
            String prefix = "";
            TrieNode cur = root;
            for (int i = 0; i < word.length(); i++) {
                if (!cur.node.containsKey(word.charAt(i))) {
                    return cur.isWord ? prefix : word;
                }
                prefix += word.charAt(i);
                cur = cur.node.get(word.charAt(i));
                if (cur.isWord) return prefix;
            }
            return cur.isWord ? prefix : word;
        }


        private static class TrieNode {
            boolean isWord;
            Map<Character, TrieNode> node;

            TrieNode() {
                node = new HashMap<>();
            }
        }
    }

    public String replaceWords(List<String> dictionary, String sentence) {
        Trie trie = new Trie(dictionary);
        return Arrays.stream(sentence.split(" "))
                .map(trie::findPrefix)
                .collect(Collectors.joining(" "));
    }
}
