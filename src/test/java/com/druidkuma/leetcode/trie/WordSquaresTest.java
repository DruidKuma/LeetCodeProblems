package com.druidkuma.leetcode.trie;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/26/22
 */
class WordSquaresTest {

    private final WordSquares underTest = new WordSquares();

    @Test
    void test_example1() {
        assertThat(underTest.wordSquares(new String[] {"area","lead","wall","lady","ball"}), containsInAnyOrder(
                List.of("ball","area","lead","lady"),
                List.of("wall","area","lead","lady")
        ));
    }

    @Test
    void test_example2() {
        assertThat(underTest.wordSquares(new String[] {"abat","baba","atan","atal"}), containsInAnyOrder(
                List.of("baba","abat","baba","atal"),
                List.of("baba","abat","baba","atan")
        ));
    }

}
