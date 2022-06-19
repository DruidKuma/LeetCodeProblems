package com.druidkuma.leetcode.queuestack;

import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 * 20
 *
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> brackets = Map.of(
                '[', ']',
                '{','}',
                '(', ')'
        );
        Set<Character> openBrackets = brackets.keySet();
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (openBrackets.contains(ch)) {
                stack.push(ch);
            }
            else if (stack.isEmpty() || !brackets.get(stack.pop()).equals(ch)) return false;
        }
        return stack.isEmpty();
    }
}
