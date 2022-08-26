package com.druidkuma.leetcode.spotify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 7/3/22
 */
class RemoveAllAdjacentDuplicatesInStringIITest {

    private final RemoveAllAdjacentDuplicatesInStringII underTest = new RemoveAllAdjacentDuplicatesInStringII();

    @Test
    void test_example1() {
        assertEquals("abcd", underTest.removeDuplicates("abcd", 2));
    }

    @Test
    void test_example2() {
        assertEquals("aa", underTest.removeDuplicates("deeedbbcccbdaa", 3));
    }

    @Test
    void test_example3() {
        assertEquals("ps", underTest.removeDuplicates("pbbcggttciiippooaais", 2));
    }
}
