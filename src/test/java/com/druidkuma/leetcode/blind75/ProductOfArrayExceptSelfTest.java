package com.druidkuma.leetcode.blind75;

import com.druidkuma.leetcode.blind75.array.ProductOfArrayExceptSelf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 7/2/22
 */
class ProductOfArrayExceptSelfTest {

    private final ProductOfArrayExceptSelf underTest = new ProductOfArrayExceptSelf();

    @Test
    void test_example1() {
        assertArrayEquals(new int[] {24, 12, 8, 6}, underTest.productExceptSelf(new int[] {1, 2, 3, 4}));
    }

    @Test
    void test_example2() {
        assertArrayEquals(new int[] {0, 0, 9, 0, 0}, underTest.productExceptSelf(new int[] {-1, 1, 0, -3, 3}));
    }

}
