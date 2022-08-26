package com.druidkuma.leetcode.different;

import java.util.Arrays;

/**
 * 1465
 *
 * You are given a rectangular cake of size h x w and two arrays of integers horizontalCuts and verticalCuts where:
 *
 * horizontalCuts[i] is the distance from the top of the rectangular cake to the ith horizontal cut and similarly, and
 * verticalCuts[j] is the distance from the left of the rectangular cake to the jth vertical cut.
 * Return the maximum area of a piece of cake after you cut at each horizontal and vertical position provided in the arrays horizontalCuts and verticalCuts.
 * Since the answer can be a large number, return this modulo 109 + 7.
 */
public class MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        long maxHeight = findMax(horizontalCuts, h);
        long maxWidth = findMax(verticalCuts, w);

        return (int) ((maxWidth * maxHeight) % (1000000007));
    }

    private long findMax(int[] nums, int length) {
        long max = Math.max(nums[0], length - nums[nums.length - 1]);
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i] - nums[i - 1]);
        }
        return max;
    }

    public int maxAreaLogically(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        long maxArea = h * w;

        int up = 0;
        int down = h;
        Arrays.sort(horizontalCuts);
        for (int horizontalCut : horizontalCuts) {
            long topPartArea = (horizontalCut - up) * w;
            long reminder = maxArea - topPartArea;
            if (topPartArea > reminder) down = horizontalCut;
            else up = horizontalCut;
            maxArea = Math.max(topPartArea, reminder);
        }

        int left = 0;
        Arrays.sort(verticalCuts);
        for (int verticalCut : verticalCuts) {
            long leftPartArea = (down - up) * (verticalCut - left);
            long reminder = maxArea - leftPartArea;
            if (leftPartArea < reminder) left = verticalCut;
            maxArea = Math.max(leftPartArea, reminder);
        }
        return Double.valueOf(maxArea % 1000000007).intValue();
    }
}
