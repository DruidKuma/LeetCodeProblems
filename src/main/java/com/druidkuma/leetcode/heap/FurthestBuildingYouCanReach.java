package com.druidkuma.leetcode.heap;

import java.util.PriorityQueue;

/**
 * 1642
 *
 * You are given an integer array heights representing the heights of buildings, some bricks, and some ladders.
 *
 * You start your journey from building 0 and move to the next building by possibly using bricks or ladders.
 *
 * While moving from building i to building i+1 (0-indexed),
 *
 * If the current building's height is greater than or equal to the next building's height, you do not need a ladder or bricks.
 * If the current building's height is less than the next building's height, you can either use one ladder or (h[i+1] - h[i]) bricks.
 * Return the furthest building index (0-indexed) you can reach if you use the given ladders and bricks optimally.
 */
public class FurthestBuildingYouCanReach {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < heights.length - 1; i++) {
            int climb = heights[i + 1] - heights[i];
            if (climb <= 0) {
                continue;
            }
            minHeap.add(climb);
            if (minHeap.size() <= ladders) {
                continue;
            }
            bricks -= minHeap.poll();
            if (bricks < 0) return i;
        }
        return heights.length - 1;
    }

    //not working
    public int furthestBuildingNaive(int[] heights, int bricks, int ladders) {
        int currentBuilding = 0;
        while (currentBuilding < heights.length - 1) {
            int nextHeight = heights[currentBuilding + 1];
            int currentHeight = heights[currentBuilding];

            if (nextHeight <= currentHeight) currentBuilding++;
            else {
                int diff = nextHeight - currentHeight;
                if (bricks >= diff) {
                    bricks -= diff;
                    currentBuilding++;
                }
                else if (ladders > 0) {
                    ladders--;
                    currentBuilding++;
                }
                else break;
            }
        }
        return currentBuilding;
    }
}
