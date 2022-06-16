package com.druidkuma.leetcode.different;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/10/22
 */
class MajorityElementTest {

    private final MajorityElement underTest = new MajorityElement();

    @Test
    void test_example1() {
        assertEquals(3, underTest.majorityElement(new int[] {3, 2, 3}));
    }

    @Test
    void test_example2() {
        assertEquals(2, underTest.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2}));
    }
}
