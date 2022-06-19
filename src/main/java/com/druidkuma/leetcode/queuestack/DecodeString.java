package com.druidkuma.leetcode.queuestack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 394
 *
 * Given an encoded string, return its decoded string.
 *
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
 *
 * You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].
 *
 * The test cases are generated so that the length of the output will never exceed 105.
 */
public class DecodeString {
    public String decodeString(String s) {
        String result = "";
        Deque<Character> stack = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            if (ch == ']') {
                String curString = "";
                while (stack.peek() != '[') {
                    curString = stack.pop() + curString;
                }
                stack.pop();

                String times = "";
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    times = stack.pop() + times;
                }

                for (int i = 0; i < curString.length() * Integer.parseInt(times); i++) {
                    stack.push(curString.charAt(i % curString.length()));
                }
            }
            else stack.push(ch);
        }

        while (!stack.isEmpty()) {
            result = stack.pop() + result;
        }
        return result;
    }
}
