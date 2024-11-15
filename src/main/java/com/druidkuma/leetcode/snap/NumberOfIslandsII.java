package com.druidkuma.leetcode.snap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * 305
 * 
 * You are given an empty 2D binary grid grid of size m x n. The grid represents a map where 0's represent water and 1's represent land. Initially, all the cells of grid are water cells (i.e., all the cells are 0's).
 *
 * We may perform an add land operation which turns the water at position into a land. You are given an array positions where positions[i] = [ri, ci] is the position (ri, ci) at which we should operate the ith operation.
 *
 * Return an array of integers answer where answer[i] is the number of islands after turning the cell (ri, ci) into a land.
 *
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 */
public class NumberOfIslandsII {

    public List<Integer> numIslands2(int m, int n, int[][] positions) {
        UnionFind uf = new UnionFind(m * n);

        int[][] dirs = new int[][]{{0,-1}, {0,1}, {-1, 0}, {1,0}};

        List<Integer> res = new ArrayList<>();

        for(int[] pos : positions) {
            uf.add(pos[0] * n + pos[1]);

            for(int[] dir : dirs) {
                int x = pos[0] + dir[0];
                int y = pos[1] + dir[1];

                if(isValid(m,n,x,y) && uf.isLand(x * n + y)) {
                    uf.union(pos[0] * n + pos[1], x * n + y);
                }
            }
            res.add(uf.findIsland());
        }
        return res;
    }


    public boolean isValid(int m, int n, int row, int col) {
        return row >= 0 && row < m && col >= 0 && col < n;
    }


    static class UnionFind {
        int[] parent;
        int count;
        HashSet<Integer> islands;

        public UnionFind(int size) {
            parent = new int[size];
            Arrays.fill(parent, -1);
            islands = new HashSet<>();
        }

        public void add(int x) {
            if (parent[x] < 0) {
                count++;
                parent[x] = x;
            }
        }

        public boolean isLand(int x) {
            return parent[x] >= 0;
        }

        public void union(int x, int y) {
            int px = find(x);
            int py = find(y);

            if(px != py) {
                parent[px] = py;
                count--;
            }
        }

        public int find(int x) {
            if(parent[x] != x) {
                return parent[x] = find(parent[x]);
            }
            return x;
        }

        public int findIsland() {
            return count;
        }
    }
}
