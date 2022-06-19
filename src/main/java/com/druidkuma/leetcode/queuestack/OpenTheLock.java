package com.druidkuma.leetcode.queuestack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * 752
 *
 * You have a lock in front of you with 4 circular wheels. Each wheel has 10 slots: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'.
 * The wheels can rotate freely and wrap around: for example we can turn '9' to be '0', or '0' to be '9'. Each move consists of turning one wheel one slot.
 *
 * The lock initially starts at '0000', a string representing the state of the 4 wheels.
 *
 * You are given a list of deadends dead ends, meaning if the lock displays any of these codes, the wheels of the lock will stop turning and you will be unable to open it.
 *
 * Given a target representing the value of the wheels that will unlock the lock, return the minimum total number of turns required to open the lock, or -1 if it is impossible.
 */
public class OpenTheLock {
    public int openLock(String[] deadends, String target) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>(Arrays.asList(deadends));
        queue.offer("0000");
        int turns = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String lockPosition = queue.poll();
                if (lockPosition.equals(target)) return turns;
                if (!visited.add(lockPosition)) continue;
                offerAllTurns(lockPosition, queue);
            }
            turns++;
        }
        return -1;
    }

    private void offerAllTurns(String lockPosition, Queue<String> queue) {
        for (int i = 0; i < lockPosition.length(); i++) {
            queue.offer(lockPosition.substring(0, i) + getNextChar(lockPosition.charAt(i), 1) + lockPosition.substring(i + 1));
            queue.offer(lockPosition.substring(0, i) + getNextChar(lockPosition.charAt(i), -1) + lockPosition.substring(i + 1));
        }
    }

    private char getNextChar(char ch, int step) {
        int numericValue = Character.getNumericValue(ch);
        if (numericValue + step < 0) numericValue = 10;
        if (numericValue + step > 9) numericValue = -1;
        return Character.forDigit(numericValue + step, 10);
    }
}
