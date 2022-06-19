package com.druidkuma.leetcode.queuestack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 286
 *
 * You are given an m x n grid rooms initialized with these three possible values.
 *
 * -1 A wall or an obstacle.
 * 0 A gate.
 * INF Infinity means an empty room. We use the value 231 - 1 = 2147483647 to represent INF as you may assume that the distance to a gate is less than 2147483647.
 * Fill each empty room with the distance to its nearest gate. If it is impossible to reach a gate, it should be filled with INF.
 */
public class WallsAndGates {
    public int[][] wallsAndGates(int[][] rooms) {
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (rooms[i][j] == 0) queue.offer(new int[] {i, j});
            }
        }

        int[][] directions = new int[][] {
                new int[] {0, 1},
                new int[] {0, -1},
                new int[] {1, 0},
                new int[] {-1, 0}
        };
        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            int x = point[0];
            int y = point[1];

            for (int[] direction : directions) {
                int x1 = x + direction[0];
                int y1 = y + direction[1];

                if (x1 < 0 || y1 < 0 || x1 >= rooms.length || y1 >= rooms[x1].length || rooms[x1][y1] != Integer.MAX_VALUE) continue;
                rooms[x1][y1] = rooms[x][y] + 1;
                queue.offer(new int[] {x1, y1});
            }
        }
        return rooms;
    }
}
