package com.druidkuma.leetcode.spotify;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 7/6/22
 */
class LetterCasePermutationTest {

    private final LetterCasePermutation underTest = new LetterCasePermutation();

    @Test
    void test_example1() {
        assertThat(underTest.letterCasePermutation("a1b2"), containsInAnyOrder("a1b2","a1B2","A1b2","A1B2"));
    }

    @Test
    void test_example2() {
        assertThat(underTest.letterCasePermutation("3z4"), containsInAnyOrder("3z4","3Z4"));
    }

}
