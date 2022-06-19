package com.druidkuma.leetcode.queuestack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 346
 *
 * Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.
 *
 * Implement the MovingAverage class:
 *
 * MovingAverage(int size) Initializes the object with the size of the window size.
 * double next(int val) Returns the moving average of the last size values of the stream.
 */
public class MovingAverageFromDataStream {

    Queue<Integer> queue;
    Long currentSum;
    int size;

    public MovingAverageFromDataStream(int size) {
        this.queue = new LinkedList<>();
        this.currentSum = 0L;
        this.size = size;
    }

    public double next(int val) {
        if (queue.size() >= size) {
            currentSum -= queue.poll();
        }
        queue.offer(val);
        currentSum += val;

        return currentSum.doubleValue() / queue.size();
    }
}
