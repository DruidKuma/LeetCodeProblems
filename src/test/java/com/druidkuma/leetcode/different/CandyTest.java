package com.druidkuma.leetcode.different;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 7/4/22
 */
class CandyTest {

    private final Candy underTest = new Candy();

    @Test
    void test_example1() {
        assertEquals(5, underTest.candy(new int[] {1, 0, 2}));
    }

    @Test
    void test_example2() {
        assertEquals(4, underTest.candy(new int[] {1, 2, 2}));
    }

}
