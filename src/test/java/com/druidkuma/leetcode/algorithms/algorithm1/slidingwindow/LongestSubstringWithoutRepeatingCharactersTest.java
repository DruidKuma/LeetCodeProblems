package com.druidkuma.leetcode.algorithms.algorithm1.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/4/22
 */
class LongestSubstringWithoutRepeatingCharactersTest {

    private final LongestSubstringWithoutRepeatingCharacters underTest = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    void test_example1() {
        assertEquals(3, underTest.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void test_example2() {
        assertEquals(1, underTest.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void test_example3() {
        assertEquals(3, underTest.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void test_example4() {
        assertEquals(1, underTest.lengthOfLongestSubstring(" "));
    }
}
