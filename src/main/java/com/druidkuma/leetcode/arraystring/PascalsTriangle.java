package com.druidkuma.leetcode.arraystring;

import java.util.ArrayList;
import java.util.List;

/**
 * 118
 *
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(List.of(1));
        for (int i = 0; i < numRows - 1; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            List<Integer> prevRow = result.get(i);
            for (int j = 0; j < i; j++) {
                row.add(prevRow.get(j) + prevRow.get(j+1));
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
}
