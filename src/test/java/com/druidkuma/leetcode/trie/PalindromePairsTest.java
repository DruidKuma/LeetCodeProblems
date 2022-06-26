package com.druidkuma.leetcode.trie;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/26/22
 */
class PalindromePairsTest {

    private final PalindromePairs underTest = new PalindromePairs();

    @Test
    void test_example1() {
        assertThat(underTest.palindromePairs(new String[] {"abcd","dcba","lls","s","sssll"}), containsInAnyOrder(
                List.of(0,1), List.of(1,0), List.of(3,2), List.of(2,4)));
    }

    @Test
    void test_example2() {
        assertThat(underTest.palindromePairs(new String[] {"bat","tab","cat"}), containsInAnyOrder(
                List.of(0,1), List.of(1,0)));
    }

    @Test
    void test_example3() {
        assertThat(underTest.palindromePairs(new String[] {"a",""}), containsInAnyOrder(
                List.of(0,1), List.of(1,0)));
    }
}
