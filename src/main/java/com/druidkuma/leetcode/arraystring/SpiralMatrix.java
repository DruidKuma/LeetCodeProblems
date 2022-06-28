package com.druidkuma.leetcode.arraystring;

import java.util.ArrayList;
import java.util.List;

/**
 * 54
 *
 * Given an m x n matrix, return all elements of the matrix in spiral order
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        //bounds
        int lowRow = -1;
        int upRow = matrix.length;
        int lowCol = -1;
        int upCol = matrix[0].length;


        int[][] directions = new int[][] {new int[] {0, 1}, new int[] {1, 0}, new int[] {0, -1}, new int[] {-1, 0}};
        int curRow = 0;
        int curCol = 0;
        for (int i = 0; i < directions.length; i++) {
            while (curRow < upRow && curRow > lowRow && curCol < upCol && curCol > lowCol) {
                result.add(matrix[curRow][curCol]);
                if (result.size() == matrix.length * matrix[0].length) return result;
                curRow += directions[i][0];
                curCol += directions[i][1];
            }
            //right
            if (i == 0) {
                curCol--;
                curRow++;
                lowRow++;
            }
            //down
            else if (i == 1) {
                curRow--;
                curCol--;
                upCol--;
            }
            //left
            else if (i == 2) {
                curCol++;
                curRow--;
                upRow--;
            }
            //up
            else {
                curRow++;
                curCol++;
                lowCol++;
                i = -1;
            }
        }
        return result;
    }
}
