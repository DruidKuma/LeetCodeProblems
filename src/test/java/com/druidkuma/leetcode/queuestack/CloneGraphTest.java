package com.druidkuma.leetcode.queuestack;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static com.druidkuma.leetcode.queuestack.CloneGraph.Node;

/**
 * Created by Yurii Miedviediev
 *
 * FIXME: don't launch until write proper equals for Node to avoid circular connections
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/19/22
 */
class CloneGraphTest {

    private final CloneGraph underTest = new CloneGraph();

    @Test
    void test_example1() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.neighbors = Arrays.asList(node2, node4);
        node2.neighbors = Arrays.asList(node1, node3);
        node3.neighbors = Arrays.asList(node2, node4);
        node4.neighbors = Arrays.asList(node1, node3);

        assertEquals(node1, underTest.cloneGraph(node1));
    }

    @Test
    void test_example2() {
        Node node1 = new Node(1);
        assertEquals(node1, underTest.cloneGraph(node1));
    }

    @Test
    void test_example3() {
        assertNull(underTest.cloneGraph(null));
    }
}
