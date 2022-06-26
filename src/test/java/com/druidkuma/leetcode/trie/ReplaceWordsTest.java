package com.druidkuma.leetcode.trie;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/24/22
 */
class ReplaceWordsTest {

    private final ReplaceWords underTest = new ReplaceWords();

    @Test
    void test_example1() {
        assertEquals("the cat was rat by the bat", underTest.replaceWords(List.of("cat", "bat", "rat"), "the cattle was rattled by the battery"));
    }

    @Test
    void test_example2() {
        assertEquals("a a b c", underTest.replaceWords(List.of("a", "b", "c"), "aadsfasf absbs bbab cadsfafs"));
    }

    @Test
    void test_example3() {
        assertEquals("a a a a a a a a bbb baba a", underTest.replaceWords(List.of("a", "aa", "aaa", "aaaa"), "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa"));
    }

}
