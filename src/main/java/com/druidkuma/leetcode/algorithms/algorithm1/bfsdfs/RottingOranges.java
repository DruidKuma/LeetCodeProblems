package com.druidkuma.leetcode.algorithms.algorithm1.bfsdfs;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 994
 *
 * You are given an m x n grid where each cell can have one of three values:
 *
 * 0 representing an empty cell,
 * 1 representing a fresh orange, or
 * 2 representing a rotten orange.
 * Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.
 *
 * Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.
 */
public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        Queue<Pair<Integer, Integer>> queue = new ArrayDeque<>();
        int fresh = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) queue.offer(new Pair<>(i, j));
                else if (grid[i][j] == 1) fresh++;
            }
        }

        queue.offer(new Pair<>(-1, -1));

        int minutesElapsed = -1;
        int[][] directions = { {-1, 0}, {0, 1}, {1, 0}, {0, -1}};

        while (!queue.isEmpty()) {
            Pair<Integer, Integer> p = queue.poll();
            int row = p.getKey();
            int col = p.getValue();
            if (row == -1) {
                minutesElapsed++;
                if (!queue.isEmpty()) queue.offer(new Pair<>(-1, -1));
            } else {
                for (int[] d : directions) {
                    int neighborRow = row + d[0];
                    int neighborCol = col + d[1];
                    if (neighborRow >= 0 && neighborRow < grid.length &&
                            neighborCol >= 0 && neighborCol < grid[neighborRow].length) {
                        if (grid[neighborRow][neighborCol] == 1) {
                            grid[neighborRow][neighborCol] = 2;
                            fresh--;

                            queue.offer(new Pair<>(neighborRow, neighborCol));
                        }
                    }
                }
            }
        }

        // return elapsed minutes if no fresh orange left
        return fresh == 0 ? minutesElapsed : -1;
    }

    @AllArgsConstructor
    @Getter
    private static class Pair<K, V> {
        K key;
        V value;
    }
}
