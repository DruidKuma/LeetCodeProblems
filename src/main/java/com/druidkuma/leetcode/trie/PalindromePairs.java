package com.druidkuma.leetcode.trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 336
 *
 * Given a list of unique words, return all the pairs of the distinct indices (i, j) in the given list,
 * so that the concatenation of the two words words[i] + words[j] is a palindrome.
 */
public class PalindromePairs {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new ArrayList<>();
        Trie trie = buildPalindromeTrie(words);

        for (int i = 0; i < words.length; i++) {
            findPairsWithWord(i, words[i], trie, result);
        }
        return result;
    }

    private void findPairsWithWord(int wordIndex, String word, Trie trie, List<List<Integer>> result) {
        Trie cur = trie;
        for (int i = 0; i < word.length(); i++) {
            if (cur.wordIndex != null && hasPalindromeRemaining(word, i)) result.add(List.of(wordIndex, cur.wordIndex));
            cur = cur.children.get(word.charAt(i));
            if (cur == null) return;
        }
        if (cur.wordIndex != null && cur.wordIndex != wordIndex) result.add(List.of(wordIndex, cur.wordIndex));
        cur.palindromeIndexes.forEach(indx -> result.add(List.of(wordIndex, indx)));
    }

    private Trie buildPalindromeTrie(String[] words) {
        Trie root = new Trie();
        for (int i = 0; i < words.length; i++) {
            Trie cur = root;
            String word = new StringBuilder(words[i]).reverse().toString();
            for (int j = 0; j < word.length(); j++) {
                if (hasPalindromeRemaining(word, j)) cur.palindromeIndexes.add(i);
                char ch = word.charAt(j);
                if (!cur.children.containsKey(ch)) cur.children.put(ch, new Trie());
                cur = cur.children.get(ch);
            }
            cur.wordIndex = i;
        }
        return root;
    }

    public boolean hasPalindromeRemaining(String s, int i) {
        int p1 = i;
        int p2 = s.length() - 1;
        while (p1 < p2) {
            if (s.charAt(p1) != s.charAt(p2)) return false;
            p1++; p2--;
        }
        return true;
    }

    private static class Trie {
        Integer wordIndex;
        List<Integer> palindromeIndexes = new ArrayList<>();
        private Map<Character, Trie> children = new HashMap<>();
    }

    public List<List<Integer>> palindromePairsBruteForce(String[] words) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j) {
                    if (isPalindrome(words[i] + words[j])) result.add(List.of(i, j));
                }
            }
        }
        return result;
    }

    private boolean isPalindrome(String word) {
        if (word.length() <= 1) return true;
        return word.charAt(0) == word.charAt(word.length() - 1) && isPalindrome(word.substring(1, word.length() - 1));
    }
}

