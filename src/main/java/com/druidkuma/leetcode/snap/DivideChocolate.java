package com.druidkuma.leetcode.snap;

/**
 * 1231
 * 
 * You have one chocolate bar that consists of some chunks. Each chunk has its own sweetness given by the array sweetness.
 *
 * You want to share the chocolate with your k friends so you start cutting the chocolate bar into k + 1 pieces using k cuts, each piece consists of some consecutive chunks.
 *
 * Being generous, you will eat the piece with the minimum total sweetness and give the other pieces to your friends.
 *
 * Find the maximum total sweetness of the piece you can get by cutting the chocolate bar optimally.
 */
public class DivideChocolate {

    public int maximizeSweetness(int[] sweetness, int k) {
        int left = 1;
        int right = 0;
        for (int s : sweetness) {
            right += s;
        }

        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            if (canDivide(sweetness, k + 1, mid)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    private boolean canDivide(int[] sweetness, int pieces, int minSweetness) {
        int currentSweetness = 0;
        int count = 0;

        for (int s : sweetness) {
            currentSweetness += s;
            if (currentSweetness >= minSweetness) {
                count++;
                currentSweetness = 0;
            }
        }

        return count >= pieces;
    }
    
}
