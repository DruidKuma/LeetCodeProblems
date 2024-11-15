package com.druidkuma.leetcode.snap.misc;

import java.util.*;

class Operation {
    int value;
    String expression;

    Operation(int value, String expression) {
        this.value = value;
        this.expression = expression;
    }
}

public class ShortestPathToTarget {

    public static String findShortestPath(int target, int num) {
        // If the number is already the target
        if (num == target) return String.valueOf(num);

        // Queue for BFS
        Queue<Operation> queue = new LinkedList<>();
        queue.add(new Operation(num, String.valueOf(num)));

        // Set to track visited values
        Set<Integer> visited = new HashSet<>();
        visited.add(num);

        while (!queue.isEmpty()) {
            Operation current = queue.poll();
            
            // Try each operation and add to the queue if not visited
            int[] nextValues = {
                current.value + num,
                current.value - num,
                current.value * num,
                num != 0 && current.value % num == 0 ? current.value / num : Integer.MIN_VALUE
            };
            String[] nextExpressions = {
                current.expression + " + " + num,
                current.expression + " - " + num,
                current.expression + " * " + num,
                current.value % num == 0 ? current.expression + " / " + num : null
            };

            for (int i = 0; i < 4; i++) {
                int nextValue = nextValues[i];
                String nextExpression = nextExpressions[i];

                if (nextValue == Integer.MIN_VALUE) continue; // Skip invalid operations (division by zero)

                // If we've reached the target, return the expression
                if (nextValue == target) {
                    return nextExpression;
                }

                // Add to the queue if not visited
                if (!visited.contains(nextValue)) {
                    visited.add(nextValue);
                    queue.add(new Operation(nextValue, nextExpression));
                }
            }
        }

        // If no solution was found
        return "No solution";
    }

    public static void main(String[] args) {
        int target = 26;
        int num = 3;
        System.out.println("Shortest path to reach " + target + " using " + num + ": " + findShortestPath(target, num));
    }
}
