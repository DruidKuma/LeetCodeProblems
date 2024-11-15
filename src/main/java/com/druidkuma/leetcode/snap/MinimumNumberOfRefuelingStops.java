package com.druidkuma.leetcode.snap;

import java.util.PriorityQueue;

/**
 * 871
 * 
 * A car travels from a starting position to a destination which is target miles east of the starting position.
 *
 * There are gas stations along the way. The gas stations are represented as an array stations where stations[i] = [positioni, fueli] indicates that the ith gas station is positioni miles east of the starting position and has fueli liters of gas.
 *
 * The car starts with an infinite tank of gas, which initially has startFuel liters of fuel in it. It uses one liter of gas per one mile that it drives. When the car reaches a gas station, it may stop and refuel, transferring all the gas from the station into the car.
 *
 * Return the minimum number of refueling stops the car must make in order to reach its destination. If it cannot reach the destination, return -1.
 *
 * Note that if the car reaches a gas station with 0 fuel left, the car can still refuel there. If the car reaches the destination with 0 fuel left, it is still considered to have arrived.
 */
public class MinimumNumberOfRefuelingStops {

    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        int stops = 0, fuel = startFuel, i = 0;

        while (fuel < target) {
            // Add all stations we can reach with the current fuel to the max-heap
            while (i < stations.length && stations[i][0] <= fuel) {
                maxHeap.offer(stations[i][1]);
                i++;
            }

            // If there are no reachable stations left and fuel is still less than target, return -1
            if (maxHeap.isEmpty()) return -1;

            // Refuel with the maximum fuel from previous stations
            fuel += maxHeap.poll();
            stops++;
        }

        return stops;
    }
    
}
