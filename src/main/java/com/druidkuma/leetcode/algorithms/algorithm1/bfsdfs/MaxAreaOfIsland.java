package com.druidkuma.leetcode.algorithms.algorithm1.bfsdfs;

/**
 * 695
 *
 * You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.)
 * You may assume all four edges of the grid are surrounded by water.
 *
 * The area of an island is the number of cells with a value 1 in the island.
 *
 * Return the maximum area of an island in grid. If there is no island, return 0.
 */
public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int result = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                result = Math.max(result, checkIsland(grid, i, j));
            }
        }

        return result;
    }

    private int checkIsland(int[][] grid, int i, int j) {
        if (i >= grid.length || j >= grid[0].length || i < 0 || j < 0 || grid[i][j] <= 0) return 0;
        grid[i][j] = -1;
        return 1 + checkIsland(grid, i+1, j) + checkIsland(grid, i-1, j) + checkIsland(grid, i, j+1) + checkIsland(grid, i, j-1);
    }
}
