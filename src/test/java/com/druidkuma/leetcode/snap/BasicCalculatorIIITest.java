package com.druidkuma.leetcode.snap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 25.10.2024
 */
class BasicCalculatorIIITest {
    
    private final BasicCalculatorIII underTest = new BasicCalculatorIII();
    
    @Test
    void test_example1() {
        var actual = underTest.calculate("2*(5+5*2)/3+(6/2+8)");
        assertEquals(actual, 21);
    }

}