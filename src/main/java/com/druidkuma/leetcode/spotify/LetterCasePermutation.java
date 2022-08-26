package com.druidkuma.leetcode.spotify;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 784
 *
 * Given a string s, you can transform every letter individually to be lowercase or uppercase to create another string.
 *
 * Return a list of all possible strings we could create. Return the output in any order.
 */
public class LetterCasePermutation {
    public List<String> letterCasePermutation(String s) {
        if (s == null) return Collections.emptyList();
        List<String> result = new ArrayList<>();
        helper(s.toCharArray(), result, 0);
        return result;
    }

    private void helper(char[] s, List<String> result, int i) {
        if (i >= s.length) {
            result.add(new String(s));
            return;
        }

        if (!Character.isLetter(s[i])) {
            helper(s, result, i + 1);
            return;
        }

        s[i] = Character.toLowerCase(s[i]);
        helper(s, result, i + 1);

        s[i] = Character.toUpperCase(s[i]);
        helper(s, result, i + 1);
    }
}
