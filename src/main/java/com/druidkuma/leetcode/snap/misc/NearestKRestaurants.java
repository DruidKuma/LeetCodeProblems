package com.druidkuma.leetcode.snap.misc;

import java.util.*;

public class NearestKRestaurants {
    
    static class Step {
        int currentX;
        int currentY;
        int steps;
        
        Step(int x, int y, int steps) {
            this.currentX = x;
            this.currentY = y;
            this.steps = steps;
        }
        
        int getSteps() {
            return steps;
        }
        
        int getCurrentX() {
            return this.currentX;
        }
        int getCurrentY() {
            return this.currentY;
        }
        
    }

    static Map<Character, Integer> locateNearestKRestaurants(char[][] restaurantMap, int customerCurrentX, int customerCurrentY, int k) {
         Queue<Step> queue = new PriorityQueue<>(Comparator.comparing(Step::getSteps));
         queue.offer(new Step(customerCurrentX, customerCurrentY, 0));
         
         int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
         
         Map<Character, Integer> resultMap = new HashMap<>();
         
         while (!queue.isEmpty()) {
            Step currentStep = queue.poll();
            int currentX = currentStep.getCurrentX();
            int currentY = currentStep.getCurrentY();
            Character currentPoint = restaurantMap[currentX][currentY];
            
            if (Character.isAlphabetic(currentPoint)) {
                if (resultMap.containsKey(currentPoint)) {
                    continue;
                } else {
                    resultMap.put(currentPoint, currentStep.getSteps());
                    if (resultMap.size() >= k) return getSortedMap(resultMap);
                }
            }
             
            for (int[] dir : directions) {
                int nextX = currentX + dir[0];
                int nextY = currentY + dir[1];
                
                if (validateCorrdinates(restaurantMap, nextX, nextY)) {
                    queue.offer(new Step(nextX, nextY, currentStep.getSteps() + 1));
                }
            }
         }
         return resultMap;
    }
    
    private static Map<Character, Integer> getSortedMap(Map<Character, Integer> map) {
        Map<Character, Integer> result = new LinkedHashMap<>();
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(entry -> result.put(entry.getKey(), entry.getValue()));
        return result;
    }
    
    private static boolean validateCorrdinates(char[][] map, int x, int y) {
        int rows = map.length;
        int cols = map[0].length;
        
        if (x < 0 || x >= rows || y < 0 || y >= cols || map[x][y] == '=') return false;
        return true;
    }

    public static void main(String[] args) {
        
        char[][] map = {
        {'A', ' ', ' ', ' ', 'D', ' '},
        {' ', ' ', 'B', ' ', ' ', ' '},
        {' ', ' ', '=', '=', '=', ' '},
        {' ', '=', '@', ' ', ' ', ' '},
        {' ', 'E', '=', ' ', ' ', 'C'},
        {' ', ' ', ' ', ' ', ' ', ' '}
        };

        System.out.println(locateNearestKRestaurants(map, 3, 3, 2));
    }
}
// Your old code in python3 has been preserved below.
// {
// {"A", " ", " ", " ", "D", " "},
// {" ", " ", "B", " ", " ", " "},
// {" ", " ", "=", "=", "=", " "},
// {" ", "=", "@", " ", " ", " "},
// {" ", "E", "=", " ", " ", "C"},
// {" ", " ", " ", " ", " ", " "},
// }


// C: 4
// E: 6
// D: 7

// B: 8
// A: 11
