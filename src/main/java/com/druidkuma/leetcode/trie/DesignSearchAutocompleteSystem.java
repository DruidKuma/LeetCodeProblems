package com.druidkuma.leetcode.trie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/24/22
 */
public class DesignSearchAutocompleteSystem {
    Map<String, Integer> hotMap;
    private TrieNode root;
    String currentInput;
    Comparator<String> comparator;

    public DesignSearchAutocompleteSystem(String[] sentences, int[] times) {
        root = new TrieNode();
        hotMap = new HashMap<>();
        currentInput = "";
        comparator = (s1, s2) -> {
            int c = -1*Integer.compare(hotMap.get(s1), hotMap.get(s2));
            if(c!=0) return c;
            else return s1.compareTo(s2);
        };
        for (int i = 0; i < sentences.length; i++) {
            hotMap.put(sentences[i], times[i]);
            insertSentence(sentences[i]);
        }
    }

    public List<String> input(char c) {
        if (c == '#') {
            hotMap.put(currentInput, hotMap.getOrDefault(currentInput, 0) + 1);
            insertSentence(currentInput);
            currentInput = "";
            return Collections.emptyList();
        }
        currentInput += c;

        TrieNode cur = root;
        for (int i = 0; i < currentInput.length(); i++) {
            char charAt = currentInput.charAt(i);
            if (!cur.node.containsKey(charAt)) return Collections.emptyList();
            cur = cur.node.get(charAt);
        }

        return cur.sentences;
    }

    private void insertSentence(String sentence) {
        TrieNode cur = root;
        for (int i = 0; i < sentence.length(); i++) {
            if (!cur.node.containsKey(sentence.charAt(i))) {
                cur.node.put(sentence.charAt(i), new TrieNode());
            }
            cur = cur.node.get(sentence.charAt(i));

            if(!cur.sentences.contains(sentence)){
                cur.sentences.add(sentence);
            }
            cur.sentences.sort(comparator);
            if(cur.sentences.size()>3) cur.sentences.remove(cur.sentences.size()-1);
        }
    }

    private static class TrieNode {
        private Map<Character, TrieNode> node;
        List<String> sentences;

        public TrieNode() {
            this.node = new HashMap<>();
            this.sentences = new ArrayList<>();
        }
    }
}
