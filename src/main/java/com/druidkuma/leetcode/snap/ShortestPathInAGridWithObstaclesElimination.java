package com.druidkuma.leetcode.snap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 1293
 * 
 * You are given an m x n integer matrix grid where each cell is either 0 (empty) or 1 (obstacle). You can move up, down, left, or right from and to an empty cell in one step.
 *
 * Return the minimum number of steps to walk from the upper left corner (0, 0) to the lower right corner (m - 1, n - 1) given that you can eliminate at most k obstacles. If it is not possible to find such walk return -1.
 */
public class ShortestPathInAGridWithObstaclesElimination {
    
    public int shortestPath(int[][] grid, int k) {
        int r = grid.length;
        int c = grid[0].length;
        Queue<Step> queue = new PriorityQueue<>(Comparator.comparingInt(s -> s.stepsCount));
        queue.offer(new Step(0, 0, 0, 0));

        int[][] minObstacles = new int[r][c];
        for (int[] row : minObstacles) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        minObstacles[0][0] = 0;

        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        while (!queue.isEmpty()) {
            Step step = queue.poll();
            if (step.currentRow == r - 1 && step.currentColumn == c - 1) {
                return step.stepsCount;
            }
            for (int[] direction : directions) {
                int nextRow = step.currentRow + direction[0];
                int nextCol = step.currentColumn + direction[1];
                if (nextRow >= 0 && nextCol >= 0 && nextRow < r && nextCol < c) {
                    int newObstacles = step.obstaclesRemoved + grid[nextRow][nextCol];
                    if (newObstacles <= k && newObstacles < minObstacles[nextRow][nextCol]) {
                        minObstacles[nextRow][nextCol] = newObstacles;
                        queue.offer(new Step(step.stepsCount + 1, nextRow, nextCol, newObstacles));
                    }
                }
            }
        }
        
        return -1;
    }
    
    static class Step {
        public int stepsCount;
        public int currentRow;
        public int currentColumn;
        public int obstaclesRemoved;

        public Step(int stepsCount, int currentRow, int currentColumn, int obstaclesRemoved) {
            this.stepsCount = stepsCount;
            this.currentRow = currentRow;
            this.currentColumn = currentColumn;
            this.obstaclesRemoved = obstaclesRemoved;
        }
    }

    public int shortestPathOptimal(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        // Early exit if k is large enough to go directly to the target
        if (k >= m + n - 2) {
            return m + n - 2;
        }

        // Priority queue (min-heap) with entries (steps, x, y, obstacles_eliminated)
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        queue.offer(new int[]{0, 0, 0, 0});  // (steps, x, y, obstacles_eliminated)

        // Initialize visited array with max values
        int[][] minObstacles = new int[m][n];
        for (int[] row : minObstacles) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        minObstacles[0][0] = 0;

        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int steps = current[0];
            int x = current[1];
            int y = current[2];
            int obstacles = current[3];

            // If we've reached the bottom-right corner, return the steps
            if (x == m - 1 && y == n - 1) {
                return steps;
            }

            // Explore the four possible directions
            for (int[] direction : directions) {
                int newX = x + direction[0];
                int newY = y + direction[1];

                if (newX >= 0 && newY >= 0 && newX < m && newY < n) {
                    int newObstacles = obstacles + grid[newX][newY];

                    // Only proceed if newObstacles is within limits and offers a better path
                    if (newObstacles <= k && newObstacles < minObstacles[newX][newY]) {
                        minObstacles[newX][newY] = newObstacles;
                        queue.offer(new int[]{steps + 1, newX, newY, newObstacles});
                    }
                }
            }
        }

        // If we exhaust the queue without reaching the target, return -1
        return -1;
    }
}
