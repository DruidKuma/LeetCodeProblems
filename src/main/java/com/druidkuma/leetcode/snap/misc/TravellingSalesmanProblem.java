package com.druidkuma.leetcode.snap.misc;

import java.util.ArrayList;
import java.util.List;

/**
 * 1) Brute Force: Try all possible permutations of the cities and calculate the total distance for each route. This approach is not feasible for large inputs due to its factorial time complexity
 * 2) Dynamic Programming: This approach (Held-Karp algorithm) uses a bitmask and DP table to record the shortest paths between subsets of cities. The time complexity is 
 * 𝑂(2𝑛×𝑛2), which is better but still exponential.
 * 3) Greedy Approximation: Use heuristics like the Nearest Neighbor or Minimum Spanning Tree (MST) to find approximate solutions quickly. This approach is suboptimal but runs in
 * O(n2), which is faster for large inputs.
 * 4) Genetic Algorithm or Simulated Annealing: These are meta-heuristic approaches that search for approximate solutions over multiple iterations.
 */
public class TravellingSalesmanProblem {
    // Function to find the nearest unvisited city
    public static int findNearestCity(int[][] distances, int currentCity, boolean[] visited) {
        int nearestCity = -1;
        int shortestDistance = Integer.MAX_VALUE;

        for (int i = 0; i < distances.length; i++) {
            if (!visited[i] && distances[currentCity][i] < shortestDistance) {
                nearestCity = i;
                shortestDistance = distances[currentCity][i];
            }
        }

        return nearestCity;
    }

    // Greedy algorithm to approximate the shortest route
    public static List<Integer> greedyTSP(int[][] distances) {
        int numCities = distances.length;
        List<Integer> route = new ArrayList<>();
        boolean[] visited = new boolean[numCities];

        int currentCity = 0; // Start from the first city (index 0)
        route.add(currentCity);
        visited[currentCity] = true;

        // Build the route by visiting the nearest unvisited city
        for (int i = 1; i < numCities; i++) {
            int nextCity = findNearestCity(distances, currentCity, visited);
            route.add(nextCity);
            visited[nextCity] = true;
            currentCity = nextCity;
        }

        return route;
    }

    // Function to calculate the total distance of a route
    public static int calculateRouteDistance(int[][] distances, List<Integer> route) {
        int totalDistance = 0;
        for (int i = 0; i < route.size() - 1; i++) {
            totalDistance += distances[route.get(i)][route.get(i + 1)];
        }
        // Add distance to return to the starting city
        totalDistance += distances[route.get(route.size() - 1)][route.get(0)];
        return totalDistance;
    }

    public static void main(String[] args) {
        int[][] distances = {
                {0, 10, 15, 20},
                {10, 0, 35, 25},
                {15, 35, 0, 30},
                {20, 25, 30, 0}
        };

        // Get the greedy route
        List<Integer> route = greedyTSP(distances);
        System.out.println("Greedy Route: " + route);

        // Calculate the total distance of the route
        int totalDistance = calculateRouteDistance(distances, route);
        System.out.println("Total Distance: " + totalDistance);
    }
}
