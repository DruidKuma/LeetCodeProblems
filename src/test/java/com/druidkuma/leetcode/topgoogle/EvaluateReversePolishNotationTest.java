package com.druidkuma.leetcode.topgoogle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/1/22
 */
class EvaluateReversePolishNotationTest {

    private final EvaluateReversePolishNotation underTest = new EvaluateReversePolishNotation();

    @Test
    void test_example1() {
        assertEquals(9, underTest.evalRPN(new String[] {"2","1","+","3","*"}));
    }

    @Test
    void test_example2() {
        assertEquals(6, underTest.evalRPN(new String[] {"4","13","5","/","+"}));
    }

    @Test
    void test_example3() {
        assertEquals(22, underTest.evalRPN(new String[] {"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }

}
