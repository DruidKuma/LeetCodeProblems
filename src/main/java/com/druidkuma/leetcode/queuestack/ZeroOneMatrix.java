package com.druidkuma.leetcode.queuestack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 542
 *
 * Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.
 *
 * The distance between two adjacent cells is 1.
 */
public class ZeroOneMatrix {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[mat.length][mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    queue.offer(new int[] {i, j});
                    visited[i][j] = true;
                }
            }
        }

        int[][] direction = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            int x = point[0];
            int y = point[1];

            for (int[] dir : direction) {
                int x1 = x + dir[0];
                int y1 = y + dir[1];
                if (x1 < 0 || y1 < 0 || x1 >= mat.length || y1 >= mat[x1].length || visited[x1][y1]) continue;

                queue.add(new int[] {x1, y1});
                mat[x1][y1] = mat[x][y] + 1;
                visited[x1][y1] = true;
            }
        }
        return mat;
    }
}
