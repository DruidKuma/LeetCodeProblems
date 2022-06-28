package com.druidkuma.leetcode.arraystring;

/**
 * 498
 *
 * Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.
 */
public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int[] result = new int[rows * cols];
        int curRow = 0;
        int curCol = 0;
        int direction = 1; //1 for up, -1 for down
        for (int i = 0; i < rows * cols; i++) {
            result[i] = mat[curRow][curCol];
            if (direction == 1) {
                curRow--;
                curCol++;
                if (curCol >= cols) {
                    curRow += 2;
                    curCol--;
                    direction = -1;
                }
                else if (curRow < 0) {
                    curRow = 0;
                    direction = -1;
                }
            }
            else {
                curRow++;
                curCol--;
                if (curRow >= rows) {
                    curCol +=2;
                    curRow--;
                    direction = 1;
                }
                else if (curCol < 0) {
                    curCol = 0;
                    direction = 1;
                }
            }
        }
        return result;
    }
}
