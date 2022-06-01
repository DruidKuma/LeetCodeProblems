package com.druidkuma.leetcode.topgoogle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;

/**
 * 150
 *
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 *
 * Valid operators are +, -, *, and /. Each operand may be an integer or another expression.
 *
 * Note that division between two integers should truncate toward zero.
 *
 * It is guaranteed that the given RPN expression is always valid.
 * That means the expression would always evaluate to a result, and there will not be any division by zero operation.
 */
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        List<String> tokenList = new ArrayList<>(Arrays.asList(tokens));
        Map<String, BiFunction<String, String, String>> operations = Map.of(
                "+", (s, s2) -> String.valueOf(Integer.parseInt(s) + Integer.parseInt(s2)),
                "*", (s, s2) -> String.valueOf(Integer.parseInt(s) * Integer.parseInt(s2)),
                "-", (s, s2) -> String.valueOf(Integer.parseInt(s) - Integer.parseInt(s2)),
                "/", (s, s2) -> String.valueOf(Integer.parseInt(s) / Integer.parseInt(s2))
        );
        Set<String> operationsSet = operations.keySet();
        while(tokenList.size() > 1) {
            for (int i = 0; i < tokenList.size(); i++) {
                if (operationsSet.contains(tokenList.get(i))) {
                    String operationResult = operations.get(tokenList.get(i)).apply(tokenList.get(i - 2), tokenList.get(i - 1));
                    tokenList.remove(i--);
                    tokenList.remove(i--);
                    tokenList.remove(i);
                    tokenList.add(i, operationResult);
                    break;
                }
            }
        }

        return Integer.parseInt(tokenList.get(0));
    }
}
