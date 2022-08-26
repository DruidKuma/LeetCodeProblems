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
class RansomNoteTest {

    private final RansomNote underTest = new RansomNote();

    @Test
    void test_example1() {
        assertFalse(underTest.canConstruct("a", "b"));
    }

    @Test
    void test_example2() {
        assertFalse(underTest.canConstruct("aa", "ab"));
    }

    @Test
    void test_example3() {
        assertTrue(underTest.canConstruct("aa", "aab"));
    }

}
