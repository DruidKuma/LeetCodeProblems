package com.druidkuma.leetcode.resursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/24/22
 */
class KthSymbolInGrammarTest {

    private final KthSymbolInGrammar underTest = new KthSymbolInGrammar();

    @Test
    void test_example1() {
        assertEquals(0, underTest.kthGrammar(1, 1));
    }

    @Test
    void test_example2() {
        assertEquals(0, underTest.kthGrammar(2, 1));
    }

    @Test
    void test_example3() {
        assertEquals(1, underTest.kthGrammar(2, 2));
    }

}
