package com.druidkuma.leetcode.snap;

import java.util.Stack;

/**
 * 856
 * 
 * Given a balanced parentheses string s, return the score of the string.
 *
 * The score of a balanced parentheses string is based on the following rule:
 *
 * "()" has score 1.
 * AB has score A + B, where A and B are balanced parentheses strings.
 * (A) has score 2 * A, where A is a balanced parentheses string.
 */
public class ScoreOfParenthesis {
    
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(0);
            } else {
                int innerScore = stack.pop(); // Score of the innermost expression
                int outerScore = stack.pop(); // Score of the level outside the current
                int score = Math.max(2 * innerScore, 1); // Apply rules: `()` = 1, `(A)` = 2 * A
                stack.push(outerScore + score); // Add to the previous level
            }
        }
        return stack.pop();
    }
}
