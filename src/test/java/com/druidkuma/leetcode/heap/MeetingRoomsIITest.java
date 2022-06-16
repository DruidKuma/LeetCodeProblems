package com.druidkuma.leetcode.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/16/22
 */
class MeetingRoomsIITest {

    private final MeetingRoomsII underTest = new MeetingRoomsII();

    @Test
    void test_example1() {
        assertEquals(2, underTest.minMeetingRooms(new int[][] {
                new int[] {0, 30},
                new int[] {5, 10},
                new int[] {15, 20}
        }));
    }

    @Test
    void test_example2() {
        assertEquals(1, underTest.minMeetingRooms(new int[][] {
                new int[] {7, 10},
                new int[] {2, 4}
        }));
    }

}
