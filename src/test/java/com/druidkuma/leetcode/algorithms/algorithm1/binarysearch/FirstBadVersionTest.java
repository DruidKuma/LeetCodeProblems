package com.druidkuma.leetcode.algorithms.algorithm1.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.intThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class FirstBadVersionTest {

    private final FirstBadVersion.BadVersionChecker checker = mock(FirstBadVersion.BadVersionChecker.class);
    private final FirstBadVersion underTest = new FirstBadVersion(checker);

    @Test
    void test_example1() {
        when(checker.isBadVersion(anyInt())).thenReturn(false);
        when(checker.isBadVersion(intThat(org.hamcrest.Matchers.greaterThanOrEqualTo(4)))).thenReturn(true);
        assertEquals(4, underTest.firstBadVersion(5));
    }

    @Test
    void test_example2() {
        when(checker.isBadVersion(anyInt())).thenReturn(false);
        when(checker.isBadVersion(intThat(org.hamcrest.Matchers.greaterThanOrEqualTo(1)))).thenReturn(true);
        assertEquals(1, underTest.firstBadVersion(1));
    }

    @Test
    void test_example3() {
        when(checker.isBadVersion(anyInt())).thenReturn(false);
        when(checker.isBadVersion(intThat(org.hamcrest.Matchers.greaterThanOrEqualTo(1)))).thenReturn(true);
        assertEquals(1, underTest.firstBadVersion(2));
    }

    @Test
    void test_lastVersionIsBad() {
        when(checker.isBadVersion(anyInt())).thenReturn(false);
        when(checker.isBadVersion(intThat(org.hamcrest.Matchers.greaterThanOrEqualTo(5)))).thenReturn(true);
        assertEquals(5, underTest.firstBadVersion(5));
    }
}