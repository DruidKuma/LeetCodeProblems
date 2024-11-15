package com.druidkuma.leetcode.snap.misc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordCombinationChecker {

    // Function to find all words that are combinations of other words in the list
    public static List<String> findCombinations(List<String> words) {
        List<String> result = new ArrayList<>();
        Set<String> wordSet = new HashSet<>(words);

        for (String word : words) {
            if (isCombination(word, wordSet)) {
                result.add(word);
            }
        }

        return result;
    }

    // Helper function to check if a word can be formed by other words in the set
    private static boolean isCombination(String word, Set<String> wordSet) {
        int len = word.length();
        boolean[] dp = new boolean[len + 1];
        dp[0] = true;

        // Temporarily remove the word itself from the set to avoid using it as a part
        wordSet.remove(word);

        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(word.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        // Add the word back to the set after checking
        wordSet.add(word);

        return dp[len];
    }

    public static void main(String[] args) {
        List<String> words = List.of("pin", "pine", "apple", "pineapple", "pinapple", "pie");

        List<String> combinations = findCombinations(words);

        System.out.println("Words that are combinations of other words in the list:");
        for (String word : combinations) {
            System.out.println(word);
        }
    }
}
