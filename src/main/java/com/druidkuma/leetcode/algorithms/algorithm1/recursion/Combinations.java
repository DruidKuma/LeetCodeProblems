package com.druidkuma.leetcode.algorithms.algorithm1.recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 77
 *
 * Given two integers n and k, return all possible combinations of k numbers out of the range [1, n].
 *
 * You may return the answer in any order.
 */
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> nums = new LinkedList<>();
        for(int i = 1; i < k + 1; ++i)
            nums.add(i);
        nums.add(n + 1);

        List<List<Integer>> output = new ArrayList<>();
        int j = 0;
        while (j < k) {
            j = 0;
            while ((j < k) && (nums.get(j + 1) == nums.get(j) + 1))
                nums.set(j, j++ + 1);
            nums.set(j, nums.get(j) + 1);
        }
        return output;
    }
}
