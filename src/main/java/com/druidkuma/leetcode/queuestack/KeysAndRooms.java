package com.druidkuma.leetcode.queuestack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 841
 *
 * There are n rooms labeled from 0 to n - 1 and all the rooms are locked except for room 0. Your goal is to visit all the rooms. However, you cannot enter a locked room without having its key.
 *
 * When you visit a room, you may find a set of distinct keys in it. Each key has a number on it, denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.
 *
 * Given an array rooms where rooms[i] is the set of keys that you can obtain if you visited room i, return true if you can visit all the rooms, or false otherwise.
 */
public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> keys = new HashSet<>() {{ add(0); }};
        Queue<Integer> queue = IntStream.range(0, rooms.size()).boxed().collect(Collectors.toCollection(LinkedList::new));

        while(!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int roomIndex = queue.poll();
                if (keys.contains(roomIndex)) {
                    keys.addAll(rooms.get(roomIndex));
                }
                else queue.offer(roomIndex);
            }
            if (queue.size() >= size) return false;
        }

        return true;
    }
}
