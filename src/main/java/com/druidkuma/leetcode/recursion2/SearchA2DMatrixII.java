package com.druidkuma.leetcode.recursion2;

/**
 * 240
 *
 * Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
 *
 * Integers in each row are sorted in ascending from left to right.
 * Integers in each column are sorted in ascending from top to bottom.
 */
public class SearchA2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        return helper(matrix, target, 0, 0, matrix[0].length - 1, matrix.length - 1);
    }

    private boolean helper(int[][] matrix, int target, int left, int up, int right, int down) {
        if (left > right || up > down) return false;
        if (target < matrix[up][left] || target > matrix[down][right]) return false;

        int mid = left + (right-left)/2;
        int row = up;
        while (row <= down && matrix[row][mid] <= target) {
            if (matrix[row][mid] == target) {
                return true;
            }
            row++;
        }

        return helper(matrix, target, left, row, mid-1, down) || helper(matrix, target, mid+1, up, right, row-1);
    }
}
