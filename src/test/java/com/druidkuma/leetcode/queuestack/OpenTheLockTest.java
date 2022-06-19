package com.druidkuma.leetcode.queuestack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/19/22
 */
class OpenTheLockTest {

    private final OpenTheLock underTest = new OpenTheLock();

    @Test
    void test_example1() {
        assertEquals(6, underTest.openLock(new String[] {"0201","0101","0102","1212","2002"}, "0202"));
    }

    @Test
    void test_example2() {
        assertEquals(1, underTest.openLock(new String[] {"8888"}, "0009"));
    }

    @Test
    void test_example3() {
        assertEquals(-1, underTest.openLock(new String[] {"8887","8889","8878","8898","8788","8988","7888","9888"}, "8888"));
    }

}
