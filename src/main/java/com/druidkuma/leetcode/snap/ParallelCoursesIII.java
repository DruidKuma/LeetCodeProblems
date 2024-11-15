package com.druidkuma.leetcode.snap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.function.Predicate.not;

/**
 * 2050
 * 
 * You are given an integer n, which indicates that there are n courses labeled from 1 to n. You are also given a 2D integer array relations where relations[j] = [prevCoursej, nextCoursej] denotes that course prevCoursej has to be completed before course nextCoursej (prerequisite relationship). Furthermore, you are given a 0-indexed integer array time where time[i] denotes how many months it takes to complete the (i+1)th course.
 *
 * You must find the minimum number of months needed to complete all the courses following these rules:
 *
 * You may start taking a course at any time if the prerequisites are met.
 * Any number of courses can be taken at the same time.
 * Return the minimum number of months needed to complete all the courses.
 *
 * Note: The test cases are generated such that it is possible to complete every course (i.e., the graph is a directed acyclic graph).
 */
public class ParallelCoursesIII {

    public int minimumTime(int n, int[][] relations, int[] time) {
        Set<Course> coursesWithPrerequisites = new HashSet<>();
        Map<Integer, Course> courses = IntStream.range(0 , n)
                .mapToObj(i -> new Course(i, time[i], new ArrayList<>()))
                .collect(Collectors.toMap(Course::getId, Function.identity()));
        
        for (int[] relation : relations) {
            Course prerequisite = courses.get(relation[0] - 1);
            Course dependent = courses.get(relation[1] - 1);
            prerequisite.dependents.add(dependent);
            coursesWithPrerequisites.add(dependent);
        }

        Queue<Course> availableCourses = new LinkedList<>();
        Map<Course, Integer> completionTime = new HashMap<>();
        courses.values().stream()
                .filter(not(coursesWithPrerequisites::contains))
                .forEach(course -> {
                    availableCourses.add(course);
                    completionTime.put(course, course.time);
                });

        while (!availableCourses.isEmpty()) {
            Course course = availableCourses.poll();
            course.dependents.forEach(dependent -> 
                    completionTime.put(dependent, 
                            Math.max(completionTime.getOrDefault(dependent, 0), completionTime.get(course) + dependent.time)));
            availableCourses.addAll(course.dependents);
        }
        return completionTime.values().stream().max(Integer::compareTo).orElse(0);
    }


    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static class Course {
        int id;          
        int time;
        List<Course> dependents;
    }


    public int minimumTimeOptimal(int n, int[][] relations, int[] time) {
        // Graph representation and in-degree array
        List<List<Integer>> graph = new ArrayList<>();
        int[] inDegree = new int[n];

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] relation : relations) {
            int prev = relation[0] - 1;
            int next = relation[1] - 1;
            graph.get(prev).add(next);
            inDegree[next]++;
        }

        // Queue for courses with no prerequisites
        Queue<Integer> queue = new LinkedList<>();
        int[] timeToComplete = new int[n];

        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
                timeToComplete[i] = time[i];
            }
        }

        // Topological sort and dynamic programming
        while (!queue.isEmpty()) {
            int course = queue.poll();
            for (int nextCourse : graph.get(course)) {
                timeToComplete[nextCourse] = Math.max(timeToComplete[nextCourse], timeToComplete[course] + time[nextCourse]);
                inDegree[nextCourse]--;
                if (inDegree[nextCourse] == 0) {
                    queue.offer(nextCourse);
                }
            }
        }

        // Find the maximum time from timeToComplete array
        int result = 0;
        for (int t : timeToComplete) {
            result = Math.max(result, t);
        }

        return result;
    }
}
