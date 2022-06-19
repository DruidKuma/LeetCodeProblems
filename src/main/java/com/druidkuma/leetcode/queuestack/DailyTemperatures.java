package com.druidkuma.leetcode.queuestack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 739
 *
 * Given an array of integers temperatures represents the daily temperatures,
 * return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature.
 * If there is no future day for which this is possible, keep answer[i] == 0 instead
 */
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int curDay = 0; curDay < result.length; curDay++) {
            int curTemp = temperatures[curDay];
            while(!stack.isEmpty() && temperatures[stack.peek()] < curTemp) {
                int prevDay = stack.pop();
                result[prevDay] = curDay - prevDay;
            }
            stack.push(curDay);
        }

        return result;
    }

    public int[] dailyTemperaturesNonOptimal(int[] temperatures) {
        int[] result = new int[temperatures.length];
        for (int i = 0; i < result.length; i++) {
            int days = 0;
            for (int j = i; j < temperatures.length; j++) {
                if (temperatures[j] > temperatures[i]) {
                    result[i] = days;
                    break;
                }
                days++;
            }
        }
        return result;
    }
}
