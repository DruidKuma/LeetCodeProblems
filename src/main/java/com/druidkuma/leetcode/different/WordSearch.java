package com.druidkuma.leetcode.different;

/**
 * 79
 *
 * Given an m x n grid of characters board and a string word, return true if word exists in the grid.
 *
 * The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
 */
public class WordSearch {

    private static final int[][] directions = new int[][] {
            new int[] {1, 0},
            new int[] {-1, 0},
            new int[] {0, 1},
            new int[] {0, -1}
    };

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0) && findWordOnBoard(board, i, j, word)) return true;
            }
        }
        return false;
    }

    private boolean findWordOnBoard(char[][] board, int i, int j, String word) {
        if (board[i][j] != word.charAt(0)) return false;
        if (word.length() <= 1) return true;

        char currentLetter = board[i][j];
        board[i][j] = '0';
        for (int[] direction : directions) {
            int newRow = i + direction[0];
            int newCol = j + direction[1];

            if (newRow < 0 || newRow >= board.length || newCol < 0 || newCol >= board[newRow].length) continue;
            if (findWordOnBoard(board, newRow, newCol, word.substring(1))) return true;
        }
        board[i][j] = currentLetter;
        return false;
    }
}
