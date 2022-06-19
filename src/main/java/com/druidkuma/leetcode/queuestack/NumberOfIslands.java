package com.druidkuma.leetcode.queuestack;

/**
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
 *
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 */
public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        int nums = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    markIsland(i, j, grid);
                    nums++;
                }
            }
        }
        return nums;
    }

    private void markIsland(int i, int j, char[][] grid) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] != '1') return;
        grid[i][j] = '0';

        markIsland(i+1, j, grid);
        markIsland(i-1, j, grid);
        markIsland(i, j+1, grid);
        markIsland(i, j-1, grid);
    }
}
