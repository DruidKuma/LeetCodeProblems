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
class ValidAnagramTest {

    private final ValidAnagram underTest = new ValidAnagram();

    @Test
    void test_example1() {
        assertTrue(underTest.isAnagram("anagram", "nagaram"));
    }

    @Test
    void test_example2() {
        assertFalse(underTest.isAnagram("rat", "car"));
    }

}
