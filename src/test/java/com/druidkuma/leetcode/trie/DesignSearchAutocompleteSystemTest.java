package com.druidkuma.leetcode.trie;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/25/22
 */
class DesignSearchAutocompleteSystemTest {

    @Test
    void test_example() {
        DesignSearchAutocompleteSystem obj = new DesignSearchAutocompleteSystem(new String[] {"i love you", "island", "ironman", "i love leetcode"}, new int[] {5, 3, 2, 2});
        assertEquals(List.of("i love you", "island", "i love leetcode"), obj.input('i'));
        assertEquals(List.of("i love you", "i love leetcode"), obj.input(' '));
        assertEquals(List.of(), obj.input('a'));
        assertEquals(List.of(), obj.input('#'));
    }
}
