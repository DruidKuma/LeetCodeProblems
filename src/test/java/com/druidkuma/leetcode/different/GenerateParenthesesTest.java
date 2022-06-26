package com.druidkuma.leetcode.different;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/26/22
 */
class GenerateParenthesesTest {

    private final GenerateParentheses underTest = new GenerateParentheses();

    @Test
    void test_example1() {
        assertThat(underTest.generateParenthesis(3), containsInAnyOrder(
                "((()))","(()())","(())()","()(())","()()()"
        ));
    }

    @Test
    void test_example2() {
        assertThat(underTest.generateParenthesis(1), containsInAnyOrder("()"));
    }

}
