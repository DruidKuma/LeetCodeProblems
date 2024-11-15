package com.druidkuma.leetcode.snap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 28.10.2024
 */
class ShortestPathInAGridWithObstaclesEliminationTest {
    
    private final ShortestPathInAGridWithObstaclesElimination underTest = new ShortestPathInAGridWithObstaclesElimination();
    
    @Test
    void test_example1() {
        var actual = underTest.shortestPath(new int[][]{ 
                new int[] {0,0,0}, 
                new int[] {1,1,0}, 
                new int[] {0,0,0}, 
                new int[] {0,1,1}, 
                new int[] {0,0,0} }, 1);
        assertEquals(6, actual);
    }

    @Test
    void test_example2() {
        var actual = underTest.shortestPath(new int[][]{
                new int[] {0,1,1},
                new int[] {1,1,1},
                new int[] {1,0,0} }, 1);
        assertEquals(-1, actual);
    }

}