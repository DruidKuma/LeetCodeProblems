package com.druidkuma.leetcode.snap.misc;

public class RotationPointFinder {

    public static int findRotationPoint(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Check if mid element is greater than the next element
            if (nums[mid] > nums[mid + 1]) {
                // Peak element is on the left side (or could be mid)
                right = mid;
            } else {
                // Peak element is on the right side
                left = mid + 1;
            }
        }

        // After the loop, left == right, which points to the peak element
        return left; // or return right, as they are the same at this point
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 8, 12, 9, 7, 2};
        int rotationPointIndex = findRotationPoint(nums);
        System.out.println("Rotation Point (Peak) Index: " + rotationPointIndex);
        System.out.println("Rotation Point (Peak) Value: " + nums[rotationPointIndex]);
    }
}
