package com.druidkuma.leetcode.trie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 425
 *
 * Given an array of unique strings words, return all the word squares you can build from words.
 * The same word from words can be used multiple times. You can return the answer in any order.
 *
 * A sequence of strings forms a valid word square if the kth row and column read the same string, where 0 <= k < max(numRows, numColumns).
 *
 * For example, the word sequence ["ball","area","lead","lady"] forms a word square because each word reads the same both horizontally and vertically.
 */
public class WordSquares {
    public List<List<String>> wordSquares(String[] words) {
        List<List<String>> result = new ArrayList<>();
        for (String word : words) {
            backtrack(1, new LinkedList<>(List.of(word)), result, words[0].length(), constructWordsTrie(words), words);
        }
        return result;
    }

    private void backtrack(int step, List<String> wordSquares, List<List<String>> result, int wordLength, TrieNode root, String[] words) {
        if (step == wordLength) {
            result.add(new ArrayList<>(wordSquares));
            return;
        }

        String prefix = wordSquares.stream().map(word -> Character.toString(word.charAt(step))).collect(Collectors.joining());
        for (Integer wordIndex : getWordsWithPrefix(root, prefix)) {
            wordSquares.add(words[wordIndex]);
            backtrack(step + 1, wordSquares, result, wordLength, root, words);
            wordSquares.remove(wordSquares.size() - 1);
        }
    }

    private TrieNode constructWordsTrie(String[] words) {
        TrieNode root = new TrieNode();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            TrieNode cur = root;
            for (char letter : word.toCharArray()) {
                if (!cur.node.containsKey(letter)) cur.node.put(letter, new TrieNode());
                cur = cur.node.get(letter);
                cur.wordList.add(i);
            }

        }
        return root;
    }

    private List<Integer> getWordsWithPrefix(TrieNode node, String prefix) {
        for (Character letter : prefix.toCharArray()) {
            if (!node.node.containsKey(letter)) return Collections.emptyList();
            node = node.node.get(letter);
        }
        return node.wordList;
    }

    private static class TrieNode {
        List<Integer> wordList = new ArrayList<>();
        Map<Character, TrieNode> node = new HashMap<>();
    }
}
