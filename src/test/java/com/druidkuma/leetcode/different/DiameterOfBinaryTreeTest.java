package com.druidkuma.leetcode.different;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.druidkuma.leetcode.different.DiameterOfBinaryTree.TreeNode;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/5/22
 */
class DiameterOfBinaryTreeTest {

    private final DiameterOfBinaryTree underTest = new DiameterOfBinaryTree();

    @Test
    void test_example1() {
        //[1,2,3,4,5]
        assertEquals(3, underTest.diameterOfBinaryTree(new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3))));
    }

    @Test
    void test_example2() {
        //[1,2]
        assertEquals(1, underTest.diameterOfBinaryTree(new TreeNode(1, new TreeNode(2), null)));
    }

    @Test
    void test_example3() {
        //[4,-7,-3,null,null,-9,-3,9,-7,-4,null,6,null,-6,-6,null,null,0,6,5,null,9,null,null,-1,-4,null,null,null,-2]
        assertEquals(8, underTest.diameterOfBinaryTree(
                new TreeNode(4,
                        new TreeNode(-7),
                        new TreeNode(-3,
                                new TreeNode(-9,
                                        new TreeNode(9,
                                                new TreeNode(6,
                                                        new TreeNode(0,
                                                                null,
                                                                new TreeNode(-1)),
                                                        new TreeNode(6,
                                                                new TreeNode(-4),
                                                                null
                                                        )
                                                ),
                                                null
                                        ),
                                        new TreeNode(-7,
                                                new TreeNode(-6,
                                                        new TreeNode(5),
                                                        null
                                                ),
                                                new TreeNode(-6,
                                                        new TreeNode(9,
                                                                new TreeNode(-2),
                                                                null
                                                        ),
                                                        null
                                                )
                                        )
                                ),
                                new TreeNode(-3,
                                        new TreeNode(-4),
                                        null)
                        )
                )
        ));
    }
}
