package com.druidkuma.leetcode.algorithms.algorithm1.bfsdfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 733
 *
 * You are also given three integers sr, sc, and newColor.
 * You should perform a flood fill on the image starting from the pixel image[sr][sc].
 *
 * To perform a flood fill, consider the starting pixel,
 * plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel,
 * plus any pixels connected 4-directionally to those pixels (also with the same color), and so on.
 * Replace the color of all of the aforementioned pixels with newColor.
 *
 * Return the modified image after performing the flood fill.
 */
public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor) return image;
        traverseTheMatrix(
                image,
                new LinkedList<>() {{ offer(new int[] {sr, sc}); }},
                image[sr][sc],
                newColor);
        return image;
    }

    private void traverseTheMatrix(int[][] matrix, Queue<int[]> positions, int color, int newColor) {
        if (positions.isEmpty()) return;
        int[] position = positions.poll();
        int x = position[0];
        int y = position[1];
        if (matrix[x][y] == color) {
            matrix[x][y] = newColor;
            addNodesToMatrix(positions, x, y, matrix);
        }
        traverseTheMatrix(matrix, positions, color, newColor);
    }

    private void addNodesToMatrix(Queue<int[]> positions, int initialX, int initialY, int[][] matrix) {
        int width = matrix.length;
        int height = matrix[0].length;

        if (initialX + 1 < width) positions.offer(new int[] {initialX + 1, initialY});
        if (initialX - 1 >= 0) positions.offer(new int[] {initialX - 1, initialY});
        if (initialY + 1 < height) positions.offer(new int[] {initialX, initialY + 1});
        if (initialY - 1 >= 0) positions.offer(new int[] {initialX, initialY - 1});
    }
}
