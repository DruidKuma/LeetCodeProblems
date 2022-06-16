package com.druidkuma.leetcode.heap;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/16/22
 */
public class TheKWeakestRowsInAMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Pair> minHeap = new PriorityQueue<>(Comparator.comparing(Pair::getNumSoldiers).thenComparing(Pair::getIndex));
        IntStream.range(0, mat.length)
                .forEach(index -> {
                    int[] row = mat[index];
                    int numSoldiers = Long.valueOf(Arrays.stream(row).boxed().filter(val -> val == 1).count()).intValue();
                    minHeap.add(new Pair(numSoldiers, index));
                });
        int[] result = new int[k];
        IntStream.range(0, k).forEach(indx -> {
            result[indx] = minHeap.poll().getIndex();
        });
        return result;
    }

    @AllArgsConstructor
    @Getter
    private static class Pair {
        private int numSoldiers;
        private int index;
    }
}
