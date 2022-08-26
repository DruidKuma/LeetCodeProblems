package com.druidkuma.leetcode.recursion;

import com.druidkuma.leetcode.binarytree.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/24/22
 */
class UniqueBinarySearchTreesIITest {

    private final UniqueBinarySearchTreesII underTest = new UniqueBinarySearchTreesII();

    @Test
    void test_example1() {
        assertThat(underTest.generateTrees(3),
                containsInAnyOrder(
                        new TreeNode(1, null, new TreeNode(3, new TreeNode(2), null)),
                        new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3))),
                        new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                        new TreeNode(3, new TreeNode(2, new TreeNode(1), null), null),
                        new TreeNode(3, new TreeNode(1, null, new TreeNode(2)), null)));
    }

    @Test
    void test_example2() {
        assertEquals(List.of(new TreeNode(1)), underTest.generateTrees(1));
    }

}
