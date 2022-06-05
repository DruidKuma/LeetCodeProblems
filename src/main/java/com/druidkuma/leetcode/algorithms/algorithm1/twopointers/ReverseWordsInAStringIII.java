package com.druidkuma.leetcode.algorithms.algorithm1.twopointers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 557
 *
 * Given a string s, reverse the order of characters in each word within a sentence
 * while still preserving whitespace and initial word order.
 */
public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        List<String> words = Arrays.asList(s.split(" "));
        return words.stream().map(this::reverseString).collect(Collectors.joining(" "));
    }

    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        int firstPointer = 0;
        int secondPointer = chars.length - 1;

        while (firstPointer < secondPointer) {
            swap(chars, firstPointer, secondPointer);
            firstPointer++;
            secondPointer--;
        }

        return new String(chars);
    }

    private void swap(char[] s, int firstPointer, int secondPointer) {
        char temp = s[firstPointer];
        s[firstPointer] = s[secondPointer];
        s[secondPointer] = temp;
    }
}
