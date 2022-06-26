package com.druidkuma.leetcode.trie;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/25/22
 */
public class FindMaximumXOROfTwoNumbersInAnArray {

    public int findMaximumXOR(int[] nums) {
        int maxInt = Arrays.stream(nums).boxed().mapToInt(i -> i).max().getAsInt();
        int L = (Integer.toBinaryString(maxInt)).length();
        String[] strNums = Arrays.stream(nums).boxed()
                .map(i -> Integer.toBinaryString((1 << L) | i).substring(1))
                .toArray(String[]::new);

        int maxXor = 0;
        TrieNode trie = new TrieNode();
        for (String num : strNums) {
            TrieNode node = trie;
            TrieNode xorNode = trie;
            int currXor = 0;

            for (Character bit : num.toCharArray()) {
                if (!node.children.containsKey(bit)) {
                    node.children.put(bit, new TrieNode());
                }
                node = node.children.get(bit);

                Character toggledBit = bit == '1' ? '0' : '1';
                if (xorNode.children.containsKey(toggledBit)) {
                    currXor = (currXor << 1) | 1;
                    xorNode = xorNode.children.get(toggledBit);
                } else {
                    currXor = currXor << 1;
                    xorNode = xorNode.children.get(bit);
                }
            }
            maxXor = Math.max(maxXor, currXor);
        }

        return maxXor;
    }

    public int findMaximumXORBruteForce(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    result = Math.max(result, nums[i] ^ nums[j]);
                }
            }
        }
        return result;
    }

    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();
        public TrieNode() {}
    }
}
