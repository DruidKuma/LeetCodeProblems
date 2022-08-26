package com.druidkuma.leetcode.spotify;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 7/3/22
 */
class AnalyzeUserWebsiteVisitPatternTest {

    private final AnalyzeUserWebsiteVisitPattern underTest = new AnalyzeUserWebsiteVisitPattern();

    @Test
    void test_example1() {
        assertEquals(List.of("home","about","career"), underTest.mostVisitedPattern(
                new String[] {"joe","joe","joe","james","james","james","james","mary","mary","mary"},
                new int[] {1,2,3,4,5,6,7,8,9,10},
                new String[] {"home","about","career","home","cart","maps","home","home","about","career"})
        );
    }

    @Test
    void test_example2() {
        assertEquals(List.of("a", "b", "a"), underTest.mostVisitedPattern(
                new String[] {"ua","ua","ua","ub","ub","ub"},
                new int[] {1,2,3,4,5,6},
                new String[] {"a","b","a","a","b","c"})
        );
    }

    @Test
    void test_example3() {
        assertEquals(List.of("oz","mryxsjc","wlarkzzqht"), underTest.mostVisitedPattern(
                new String[] {"zkiikgv","zkiikgv","zkiikgv","zkiikgv"},
                new int[] {436363475,710406388,386655081,797150921},
                new String[] {"wnaaxbfhxp","mryxsjc","oz","wlarkzzqht"})
        );
    }
}
