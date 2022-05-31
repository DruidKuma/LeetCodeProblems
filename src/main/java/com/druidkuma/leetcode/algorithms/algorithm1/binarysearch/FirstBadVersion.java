package com.druidkuma.leetcode.algorithms.algorithm1.binarysearch;

import lombok.Value;

/**
 * 278
 *
 * You are a product manager and currently leading a team to develop a new product.
 * Unfortunately, the latest version of your product fails the quality check.
 * Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 *
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 *
 * You are given an API bool isBadVersion(version) which returns whether version is bad.
 * Implement a function to find the first bad version. You should minimize the number of calls to the API.
 */
@Value
public class FirstBadVersion {

    BadVersionChecker checker;

    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        int index;
        while( (index = (start + (end - start) / 2)) <= n) {
            if(checker.isBadVersion(index)) {
                if (index == 1 || !checker.isBadVersion(index - 1)) return index;
                else end = index;
            }
            else start = index + 1;
        }

        return n;
    }

    public static class BadVersionChecker {
        boolean isBadVersion(int version) {
            return false; //to be mocked in tests
        }
    }
}
