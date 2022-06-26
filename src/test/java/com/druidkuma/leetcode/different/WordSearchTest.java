package com.druidkuma.leetcode.different;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/26/22
 */
class WordSearchTest {

    private final WordSearch underTest = new WordSearch();

    @Test
    void test_example1() {
        assertTrue(underTest.exist(new char[][] {
                new char[] {'A','B','C','E'},
                new char[] {'S','F','C','S'},
                new char[] {'A','D','E','E'}
        }, "ABCCED"));
    }

    @Test
    void test_example2() {
        assertTrue(underTest.exist(new char[][] {
                new char[] {'A','B','C','E'},
                new char[] {'S','F','C','S'},
                new char[] {'A','D','E','E'}
        }, "SEE"));
    }

    @Test
    void test_example3() {
        assertFalse(underTest.exist(new char[][] {
                new char[] {'A','B','C','E'},
                new char[] {'S','F','C','S'},
                new char[] {'A','D','E','E'}
        }, "ABCB"));
    }

    @Test
    void test_example4() {
        assertTrue(underTest.exist(new char[][] {
                new char[] {'a'}
        }, "a"));
    }
}
