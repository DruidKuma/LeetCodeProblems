package com.druidkuma.leetcode.queuestack;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/19/22
 */
class KeysAndRoomsTest {

    private final KeysAndRooms underTest = new KeysAndRooms();

    @Test
    void test_example1() {
        assertTrue(underTest.canVisitAllRooms(List.of(List.of(1), List.of(2), List.of(3), List.of())));
    }

    @Test
    void test_example2() {
        assertFalse(underTest.canVisitAllRooms(List.of(List.of(1, 3), List.of(3, 0, 1), List.of(2), List.of(0))));
    }

}
