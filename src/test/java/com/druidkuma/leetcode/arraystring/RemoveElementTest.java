package com.druidkuma.leetcode.arraystring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/28/22
 */
class RemoveElementTest {

    private final RemoveElement underTest = new RemoveElement();

    @Test
    void test_example1() {
        assertEquals(2, underTest.removeElement(new int[] {3, 2, 2, 3}, 3));
    }

    @Test
    void test_example2() {
        assertEquals(5, underTest.removeElement(new int[] {0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }

}
