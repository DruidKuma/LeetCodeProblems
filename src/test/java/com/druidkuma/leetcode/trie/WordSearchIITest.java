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
 * @since 6/25/22
 */
class WordSearchIITest {

    private final WordSearchII underTest = new WordSearchII();

    @Test
    void test_example1() {
        assertThat(underTest.findWords(new char[][] {
                new char[] {'o','a','a','n'},
                new char[] {'e','t','a','e'},
                new char[] {'i','h','k','r'},
                new char[] {'i','f','l','v'}
        }, new String[] {"oath","pea","eat","rain"}), containsInAnyOrder("eat", "oath"));
    }

    @Test
    void test_example2() {
        assertEquals(List.of(), underTest.findWords(new char[][] {
                new char[] {'a', 'b'},
                new char[] {'c', 'd'}
        }, new String[] {"abcb"}));
    }
}
