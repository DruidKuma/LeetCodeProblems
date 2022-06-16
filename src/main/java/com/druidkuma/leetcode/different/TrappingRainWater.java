package com.druidkuma.leetcode.different;

import java.util.Stack;

/**
 * 42
 *
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
 */
public class TrappingRainWater {
    public int trap(int[] height) {
        int totalTrapped = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int top = stack.pop();
                if (stack.isEmpty()) break;

                int distance = i - stack.peek() - 1;
                int boundedHeight = Math.min(height[i], height[stack.peek()]) - height[top];
                totalTrapped += distance * boundedHeight;
            }
            stack.push(i);
        }

        return totalTrapped;
    }
}
