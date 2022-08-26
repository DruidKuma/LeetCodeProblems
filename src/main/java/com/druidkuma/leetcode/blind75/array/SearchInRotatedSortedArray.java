package com.druidkuma.leetcode.blind75.array;

/**
 * 33
 *
 * There is an integer array nums sorted in ascending order (with distinct values).
 *
 * Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
 *
 * Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if (nums.length == 1) return nums[0] == target ? 0 : -1;
        if (nums[0] < nums[nums.length - 1]) return binarySearch(nums, 0, nums.length - 1, target);

        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            if (mid < nums.length - 1 && nums[mid + 1] < nums[mid]) {
                int indx = binarySearch(nums, mid + 1, nums.length - 1, target);
                return indx >= 0 ? indx : binarySearch(nums, 0, mid, target);
            }
            else if (mid > 0 && nums[mid - 1] > nums[mid]) {
                int indx = binarySearch(nums, 0, mid - 1, target);
                return indx >= 0 ? indx : binarySearch(nums, mid, nums.length - 1, target);
            }
            if (nums[mid] > nums[0]) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }

    public int binarySearch(int[] nums, int start, int end, int target) {
        int mid = start + (end - start) / 2;
        if (start > end) return -1;
        if (nums[mid] == target) return mid;
        if (nums[mid] > target) return binarySearch(nums, start, mid - 1, target);
        else return binarySearch(nums, mid + 1, end, target);
    }

    public int searchOnePass(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] >= nums[start]) {
                if (target >= nums[start] && target < nums[mid]) end = mid - 1;
                else start = mid + 1;
            }
            else {
                if (target <= nums[end] && target > nums[mid]) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }
}
