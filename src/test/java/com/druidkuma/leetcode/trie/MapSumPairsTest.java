package com.druidkuma.leetcode.trie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/24/22
 */
class MapSumPairsTest {

    @Test
    void test_example1() {
        MapSumPairs mapSum = new MapSumPairs();
        mapSum.insert("apple", 3);
        assertEquals(3, mapSum.sum("ap"));
        mapSum.insert("app", 2);
        assertEquals(5, mapSum.sum("ap"));
    }

    @Test
    void test_example2() {
        MapSumPairs mapSum = new MapSumPairs();
        mapSum.insert("apple", 3);
        assertEquals(3, mapSum.sum("ap"));
        mapSum.insert("app", 2);
        mapSum.insert("apple", 2);
        assertEquals(4, mapSum.sum("ap"));
    }

}
