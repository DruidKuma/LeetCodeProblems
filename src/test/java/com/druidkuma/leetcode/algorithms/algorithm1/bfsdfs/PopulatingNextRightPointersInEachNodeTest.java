package com.druidkuma.leetcode.algorithms.algorithm1.bfsdfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.druidkuma.leetcode.algorithms.algorithm1.bfsdfs.PopulatingNextRightPointersInEachNode.Node;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/5/22
 */
class PopulatingNextRightPointersInEachNodeTest {

    private final PopulatingNextRightPointersInEachNode underTest = new PopulatingNextRightPointersInEachNode();

    @Test
    void test_example1() {
        //build result tree
        Node seven = new Node(7);
        Node six = new Node(6, null, null, seven);
        Node five = new Node(5, null, null, six);
        Node four = new Node(4, null, null, five);
        Node three = new Node(3, six, seven, null);
        Node two = new Node(2, four, five, three);
        Node root = new Node(1, two, three, null);

        assertEquals(root, underTest.connect(new Node(1,
                new Node(2, new Node(4), new Node(5), null),
                new Node(3, new Node(6), new Node(7), null), null)));
    }

    @Test
    void test_example2() {
        assertNull(underTest.connect(null));
    }

}
