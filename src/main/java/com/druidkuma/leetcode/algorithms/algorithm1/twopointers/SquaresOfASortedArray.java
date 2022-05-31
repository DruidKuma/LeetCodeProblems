package com.druidkuma.leetcode.algorithms.algorithm1.twopointers;


/**
 * 977
 *
 * Given an integer array nums sorted in non-decreasing order,
 * return an array of the squares of each number sorted in non-decreasing order.
 */
public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] squares = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            squares[i] = nums[i] * nums[i];
        }
        java.util.Arrays.sort(squares);
        return squares;
    }
}
