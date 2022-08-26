package com.druidkuma.leetcode.spotify;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * 1152
 *
 * You are given two string arrays username and website and an integer array timestamp. All the given arrays are of the same length and the tuple [username[i], website[i], timestamp[i]] indicates that the user username[i] visited the website website[i] at time timestamp[i].
 *
 * A pattern is a list of three websites (not necessarily distinct).
 *
 * For example, ["home", "away", "love"], ["leetcode", "love", "leetcode"], and ["luffy", "luffy", "luffy"] are all patterns.
 * The score of a pattern is the number of users that visited all the websites in the pattern in the same order they appeared in the pattern.
 *
 * For example, if the pattern is ["home", "away", "love"], the score is the number of users x such that x visited "home" then visited "away" and visited "love" after that.
 * Similarly, if the pattern is ["leetcode", "love", "leetcode"], the score is the number of users x such that x visited "leetcode" then visited "love" and visited "leetcode" one more time after that.
 * Also, if the pattern is ["luffy", "luffy", "luffy"], the score is the number of users x such that x visited "luffy" three different times at different timestamps.
 * Return the pattern with the largest score. If there is more than one pattern with the same largest score, return the lexicographically smallest such pattern.
 */
public class AnalyzeUserWebsiteVisitPattern {
    public List<String> mostVisitedPattern(String[] username, int[] timestamp, String[] website) {
        //collect users view history
        Map<String, TreeSet<ViewHistory>> usersViewHistory = new HashMap<>();
        for (int i = 0; i < username.length; i++) {
            usersViewHistory.putIfAbsent(username[i], new TreeSet<>());
            usersViewHistory.get(username[i]).add(new ViewHistory(timestamp[i], website[i]));
        }

        //generate patterns
        Map<Pattern, Set<String>> patternMap = new HashMap<>();
        for (Map.Entry<String, TreeSet<ViewHistory>> entry : usersViewHistory.entrySet()) {
            for (Pattern pattern : generatePatterns(entry.getValue())) {
                patternMap.putIfAbsent(pattern, new HashSet<>());
                patternMap.get(pattern).add(entry.getKey());
            }
        }

        return getMostPopularPattern(patternMap);
    }

    private Set<Pattern> generatePatterns(Set<ViewHistory> value) {
        Set<Pattern> result = new HashSet<>();
        List<String> websites = value.stream().map(h -> h.website).collect(Collectors.toList());
        for (int i = 0; i < websites.size(); i++) {
            for (int j = i+1; j < websites.size(); j++) {
                for (int k = j+1; k < websites.size(); k++) {
                    result.add(new Pattern(List.of(websites.get(i), websites.get(j), websites.get(k))));
                }
            }
        }
        return result;
    }

    private List<String> getMostPopularPattern(Map<Pattern, Set<String>> patternMap) {
        Pattern mostPopularPattern = null;
        int currentMaxUsers = -1;
        for (Map.Entry<Pattern, Set<String>> entry : patternMap.entrySet()) {
            Pattern pattern = entry.getKey();
            Set<String> users = entry.getValue();
            if (users.size() > currentMaxUsers || (users.size() == currentMaxUsers && pattern.compareTo(mostPopularPattern) < 0)) {
                currentMaxUsers = users.size();
                mostPopularPattern = pattern;
            }
        }
        return mostPopularPattern == null ? List.of() : mostPopularPattern.history;
    }

    private static class ViewHistory implements Comparable<ViewHistory> {
        int timestamp;
        String website;

        public ViewHistory(int timestamp, String website) {
            this.timestamp = timestamp;
            this.website = website;
        }

        @Override
        public int compareTo(ViewHistory o) {
            return Integer.compare(this.timestamp, o.timestamp);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ViewHistory that = (ViewHistory) o;
            return timestamp == that.timestamp &&
                    Objects.equals(website, that.website);
        }

        @Override
        public int hashCode() {
            return Objects.hash(timestamp, website);
        }
    }

    private static class Pattern implements Comparable<Pattern> {
        List<String> history;

        public Pattern(List<String> historyOrdered) {
            this.history = historyOrdered;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pattern pattern = (Pattern) o;
            return Objects.equals(history, pattern.history);
        }

        @Override
        public int hashCode() {
            return Objects.hash(history);
        }

        @Override
        public int compareTo(Pattern o) {
            if (o == null) return -1;
            String self = String.join(",", this.history);
            String other = String.join(",", o.history);
            return self.compareTo(other);
        }
    }
}
