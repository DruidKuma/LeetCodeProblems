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
class ScoreOfParenthesisTest {
    
    private final ScoreOfParenthesis underTest = new ScoreOfParenthesis();
    
    @Test
    void test_example1() {
        assertEquals(1, underTest.scoreOfParentheses("()"));
    }

    @Test
    void test_example2() {
        assertEquals(2, underTest.scoreOfParentheses("(())"));
    }

    @Test
    void test_example3() {
        assertEquals(2, underTest.scoreOfParentheses("()()"));
    }

}