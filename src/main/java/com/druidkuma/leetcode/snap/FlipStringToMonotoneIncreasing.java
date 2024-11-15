package com.druidkuma.leetcode.snap;

/**
 * 926
 * 
 * A binary string is monotone increasing if it consists of some number of 0's (possibly none), followed by some number of 1's (also possibly none).
 *
 * You are given a binary string s. You can flip s[i] changing it from 0 to 1 or from 1 to 0.
 *
 * Return the minimum number of flips to make s monotone increasing.
 */
public class FlipStringToMonotoneIncreasing {

    public int minFlipsMonoIncr(String s) {
        int countOnes = 0;
        int minFlips = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                countOnes++;
            }
            else {
                minFlips = Math.min(minFlips + 1, countOnes);
            }
        }
        return minFlips;
    }
}
