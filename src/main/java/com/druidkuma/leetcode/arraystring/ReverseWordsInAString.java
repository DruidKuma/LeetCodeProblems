package com.druidkuma.leetcode.arraystring;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 151
 *
 * Given an input string s, reverse the order of the words.
 *
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 *
 * Return a string of the words in reverse order concatenated by a single space.
 *
 * Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
 */
public class ReverseWordsInAString {
    public String reverseWords(String s) {
        List<String> token = Arrays.stream(s.split(" ")).filter(Predicate.not(String::isEmpty)).collect(Collectors.toList());
        Collections.reverse(token);
        return String.join(" ", token);
    }
}
