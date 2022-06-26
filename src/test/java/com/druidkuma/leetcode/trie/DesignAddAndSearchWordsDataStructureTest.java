package com.druidkuma.leetcode.trie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/25/22
 */
class DesignAddAndSearchWordsDataStructureTest {

    @Test
    void test_example1() {
        DesignAddAndSearchWordsDataStructure wordDictionary = new DesignAddAndSearchWordsDataStructure();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        assertFalse(wordDictionary.search("pad"));
        assertTrue(wordDictionary.search("bad"));
        assertTrue(wordDictionary.search(".ad"));
        assertTrue(wordDictionary.search("b.."));
    }

}
