package com.druidkuma.leetcode.blind75;

import com.druidkuma.leetcode.blind75.array.BestTimeToBuyAndSellStock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 7/2/22
 */
class BestTimeToBuyAndSellStockTest {

    private final BestTimeToBuyAndSellStock underTest = new BestTimeToBuyAndSellStock();

    @Test
    void test_example1() {
        assertEquals(5, underTest.maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
    }

    @Test
    void test_example2() {
        assertEquals(0, underTest.maxProfit(new int[] {7, 6, 4, 3, 1}));
    }

}
