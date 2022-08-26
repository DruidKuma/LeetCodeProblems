package com.druidkuma.leetcode.blind75;

import com.druidkuma.leetcode.blind75.array.SearchInRotatedSortedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 7/2/22
 */
class SearchInRotatedSortedArrayTest {

    private final SearchInRotatedSortedArray underTest = new SearchInRotatedSortedArray();

    @Test
    void test_example1() {
        assertEquals(4, underTest.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 0));
    }

    @Test
    void test_example2() {
        assertEquals(-1, underTest.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 3));
    }

    @Test
    void test_example3() {
        assertEquals(-1, underTest.search(new int[] {1}, 0));
    }

}
