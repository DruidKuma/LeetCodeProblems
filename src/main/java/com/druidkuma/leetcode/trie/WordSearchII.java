package com.druidkuma.leetcode.trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 212
 *
 * Given an m x n board of characters and a list of strings words, return all words on the board.
 *
 * Each word must be constructed from letters of sequentially adjacent cells,
 * where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once in a word.
 */
public class WordSearchII {
    public List<String> findWords(char[][] board, String[] words) {
        TrieNode trie = constructWordsTrie(words);

        List<String> result = new ArrayList<>();
        for (int row = 0; row < board.length; ++row) {
            for (int col = 0; col < board[row].length; ++col) {
                if (trie.node.containsKey(board[row][col])) {
                    backtracking(row, col, trie, board, result);
                }
            }
        }
        return result;
    }

    private void backtracking(int row, int col, TrieNode root, char[][] board, List<String> result) {
        Character letter = board[row][col];
        TrieNode currNode = root.node.get(letter);

        if (currNode.word != null) {
            result.add(currNode.word);
            currNode.word = null;
        }

        board[row][col] = '#';

        int[] rowOffset = {-1, 0, 1, 0};
        int[] colOffset = {0, 1, 0, -1};
        for (int i = 0; i < 4; ++i) {
            int newRow = row + rowOffset[i];
            int newCol = col + colOffset[i];
            if (newRow < 0 || newRow >= board.length || newCol < 0 || newCol >= board[0].length) {
                continue;
            }
            if (currNode.node.containsKey(board[newRow][newCol])) {
                backtracking(newRow, newCol, currNode, board, result);
            }
        }

        board[row][col] = letter;
    }

    private TrieNode constructWordsTrie(String[] words) {
        TrieNode root = new TrieNode();
        for (String word : words) {
            TrieNode cur = root;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (!cur.node.containsKey(ch)) {
                    cur.node.put(ch, new TrieNode());
                }
                cur = cur.node.get(ch);
            }
            cur.word = word;

        }
        return root;
    }

    private static class TrieNode {
        private String word;
        private Map<Character, TrieNode> node;

        public TrieNode() {
            this.node = new HashMap<>();
        }
    }
}
