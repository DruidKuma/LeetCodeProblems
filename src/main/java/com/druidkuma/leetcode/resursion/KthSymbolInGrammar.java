package com.druidkuma.leetcode.resursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 779
 *
 * We build a table of n rows (1-indexed). We start by writing 0 in the 1st row. Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.
 *
 * For example, for n = 3, the 1st row is 0, the 2nd row is 01, and the 3rd row is 0110.
 * Given two integer n and k, return the kth (1-indexed) symbol in the nth row of a table of n rows.
 */
public class KthSymbolInGrammar {
    /*
    Think of this as a binary tree. Draw the output for, say till n = 5, this you'll find few things:
    The next row has twice elements as previous one
    the first half of the current is the same as the prev row
    the 2nd half is the complement of the prev row.
    In the below figure the italicised ones are the same as the above row and the bold ones are just the complement of the above row.

    0
    01
    0110
    01101001
    0110100110010110

    We can use these properties and find our answer.
    For this, we will also need the prevK which we can calculate easily as we know the number of elements in any level of binary tree are 2^n-1. Here's the commented code:
     */
    public int kthGrammar(int n, int k) {
        if (n==1 || k==1) return 0;
        //prevK is the max symbols possible in the prev row
        int prevK = (int)Math.pow(2, n-2);//n-1 for current n-1-1 (n-2) for prev
        if (k<=prevK)
            return kthGrammar(n-1, k);
        else {
            //to handle the edge cases where we are given the last value
            //i.e. when k = the last value here k%prevK will give 0 which is invalid
            //So, we'll check for this condition and make the invalid to valid (k/2)
            int presK = k%prevK;
            int val = kthGrammar(n-1, presK==0?k/2:k%prevK);
            return val==1?0:1;//calculate the not
        }
    }
}
