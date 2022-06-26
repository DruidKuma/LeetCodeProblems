package com.druidkuma.leetcode.resursion;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/24/22
 */
class PascalsTriangleIITest {

    private final PascalsTriangleII underTest = new PascalsTriangleII();

    @Test
    void test_example1() {
        assertEquals(List.of(1, 3, 3, 1), underTest.getRow(3));
    }

    @Test
    void test_example2() {
        assertEquals(List.of(1), underTest.getRow(0));
    }

    @Test
    void test_example3() {
        assertEquals(List.of(1, 1), underTest.getRow(1));
    }
}
