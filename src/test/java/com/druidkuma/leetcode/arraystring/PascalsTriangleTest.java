package com.druidkuma.leetcode.arraystring;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/27/22
 */
class PascalsTriangleTest {

    private final PascalsTriangle underTest = new PascalsTriangle();

    @Test
    void test_example1() {
        assertEquals(List.of(List.of(1), List.of(1, 1), List.of(1, 2, 1), List.of(1, 3, 3, 1), List.of(1, 4, 6, 4, 1)), underTest.generate(5));
    }

    @Test
    void test_example2() {
        assertEquals(List.of(List.of(1)), underTest.generate(1));
    }

}
