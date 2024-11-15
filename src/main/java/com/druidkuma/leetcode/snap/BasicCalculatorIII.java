package com.druidkuma.leetcode.snap;

import java.util.Stack;

/**
 * 772
 * 
 * Implement a basic calculator to evaluate a simple expression string.
 * The expression string contains only non-negative integers, '+', '-', '*', '/' operators, and open '(' and closing parentheses ')'. The integer division should truncate toward zero.
 * You may assume that the given expression is always valid. All intermediate results will be in the range of [-231, 231 - 1].
 * Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().
 */
public class BasicCalculatorIII {
    public int calculate(String s) {
        
        Stack<Integer> stack = new Stack<>();
        int currentNumber = 0;
        char operation = '+';
        s = s.replace(" ", "");

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (Character.isDigit(ch)) {
                currentNumber = currentNumber * 10 + (ch - '0');
            }
            
            if (ch == '(') {
                int j = i;
                int brackets = 0;
                while (i < s.length()) {
                    if (s.charAt(i) == '(') brackets++;
                    if (s.charAt(i) == ')') brackets--;
                    if (brackets == 0) break;
                    i++;
                }
                currentNumber = calculate(s.substring(j+1, i));                
            }

            if (!Character.isDigit(ch) || i == s.length() - 1) {
                if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || i == s.length() - 1) {
                    if (operation == '+') {
                        stack.push(currentNumber);
                    } else if (operation == '-') {
                        stack.push(-currentNumber);
                    } else if (operation == '*') {
                        stack.push(stack.pop() * currentNumber);
                    } else if (operation == '/') {
                        stack.push(stack.pop() / currentNumber);
                    }
                    operation = ch;
                    currentNumber = 0;
                }
            }
        }
        int result = 0;
        for (int num : stack) {
            result += num;
        }
        return result;
    }
}
