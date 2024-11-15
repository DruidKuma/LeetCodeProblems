package com.druidkuma.leetcode.snap;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 29.10.2024
 */
class NumberOfIslandsIITest {
    
    private final NumberOfIslandsII underTest = new NumberOfIslandsII();
    
    @Test
    void test_example1() {
        var actual = underTest.numIslands2(3, 3, new int[][] {{0,0}, {0,1}, {1,2}, {2,1}});
        assertEquals(actual, List.of(1, 1, 2, 3));
    }

    @Test
    void test_example2() {
        var actual = underTest.numIslands2(1, 1, new int[][] {{0,0}});
        assertEquals(actual, List.of(1));
    }

}