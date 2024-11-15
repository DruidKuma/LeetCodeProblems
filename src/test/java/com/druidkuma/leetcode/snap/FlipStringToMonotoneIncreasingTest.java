package com.druidkuma.leetcode.snap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 29.10.2024
 */
class FlipStringToMonotoneIncreasingTest {
    
    private final FlipStringToMonotoneIncreasing underTest = new FlipStringToMonotoneIncreasing();
    
    @Test
    void test_example1() {
        var actual = underTest.minFlipsMonoIncr("00110");
        assertEquals(actual, 1);
    }

    @Test
    void test_example2() {
        var actual = underTest.minFlipsMonoIncr("010110");
        assertEquals(actual, 2);
    }

    @Test
    void test_example3() {
        var actual = underTest.minFlipsMonoIncr("00011000");
        assertEquals(actual, 2);
    }

}