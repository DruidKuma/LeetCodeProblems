package com.druidkuma.leetcode.spotify;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * 341
 *
 * <p>
 * You are given a nested list of integers nestedList. Each element is either an integer or a list whose elements may also be integers or other lists. Implement an iterator to flatten it.
 * <p>
 * Implement the NestedIterator class:
 * <p>
 * NestedIterator(List<NestedInteger> nestedList) Initializes the iterator with the nested list nestedList.
 * int next() Returns the next integer in the nested list.
 * boolean hasNext() Returns true if there are still some integers in the nested list and false otherwise.
 * Your code will be tested with the following pseudocode:
 * <p>
 * initialize iterator with nestedList
 * res = []
 * while iterator.hasNext()
 * append iterator.next() to the end of res
 * return res
 * If res matches the expected flattened list, then your code will be judged as correct.
 */
public class FlattenNestedListIterator implements Iterator<Integer> {

    private Deque<NestedInteger> deque;

    public FlattenNestedListIterator(List<NestedInteger> nestedList) {
        deque = new ArrayDeque<>(nestedList);
    }

    @Override
    public boolean hasNext() {
        makeIntegerTopStack();
        return !deque.isEmpty();
    }

    private void makeIntegerTopStack() {
        while (!deque.isEmpty() && !deque.peekFirst().isInteger()) {
            List<NestedInteger> list = deque.removeFirst().getList();
            for (int i = list.size() - 1; i >= 0; i--) {
                deque.addFirst(list.get(i));
            }
        }
    }

    @Override
    public Integer next() {
        if (!hasNext()) throw new NoSuchElementException();
        return deque.removeFirst().getInteger();
    }

    public interface NestedInteger {
        public boolean isInteger();
        public Integer getInteger();
        public List<NestedInteger> getList();
    }
}
