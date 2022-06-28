package com.druidkuma.leetcode.algorithms.algorithm1.recursion;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

/**
 * Created by Yurii Miedviediev
 *
 * FIXME: These test are not working, containsInAnyOrder does not consume lists. fix it
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/26/22
 */
class CombinationsTest {

    private final Combinations underTest = new Combinations();

    @Test
    void test_example1() {
        assertThat(underTest.combine(4, 2), containsInAnyOrder(
                List.of(2,4),
                List.of(3,4),
                List.of(2,3),
                List.of(1,2),
                List.of(1,3),
                List.of(1,4)
        ));
    }

    @Test
    void test_example2() {
        assertThat(underTest.combine(1, 1), containsInAnyOrder(
                List.of(1)
        ));
    }

}
