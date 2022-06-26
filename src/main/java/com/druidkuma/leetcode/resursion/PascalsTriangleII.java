package com.druidkuma.leetcode.resursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 119
 *
 * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
 */
public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        return helper(rowIndex, new HashMap<>(Map.of(0, List.of(1))));
    }

    private List<Integer> helper(int row, Map<Integer, List<Integer>> memo) {
        if (!memo.containsKey(row)) {
            List<Integer> prevRow = helper(row - 1, memo);
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for (int i = 0; i < prevRow.size() - 1; i++) {
                newRow.add(prevRow.get(i) + prevRow.get(i + 1));
            }
            newRow.add(1);
            memo.put(row, newRow);
        }
        return memo.get(row);
    }
}
