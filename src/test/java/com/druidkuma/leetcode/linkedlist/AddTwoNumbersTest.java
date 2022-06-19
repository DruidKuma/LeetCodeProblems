package com.druidkuma.leetcode.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 6/18/22
 */
class AddTwoNumbersTest {

    private final AddTwoNumbers underTest = new AddTwoNumbers();

    @Test
    void test_example1() {
        assertEquals(new ListNode(7, new ListNode(0, new ListNode(8))), underTest.addTwoNumbers(
                new ListNode(2, new ListNode(4, new ListNode(3))),
                new ListNode(5, new ListNode(6, new ListNode(4)))
        ));
    }

    @Test
    void test_example2() {
        assertEquals(new ListNode(0), underTest.addTwoNumbers(new ListNode(0), new ListNode(0)));
    }

    @Test
    void test_example3() {
        assertEquals(new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1)))))))),
                underTest.addTwoNumbers(
                        new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))),
                        new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))
                ));
    }

    @Test
    void test_example4() {
        assertEquals(new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))))))),
                underTest.addTwoNumbers(
                        new ListNode(9),
                        new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))))
                ));
    }

    @Test
    void test_example5() {
        assertEquals(new ListNode(2, new ListNode(2, new ListNode(2, new ListNode(2, new ListNode(2, new ListNode(2, new ListNode(2, new ListNode(2, new ListNode(2, new ListNode(2, new ListNode(2))))))))))),
                underTest.addTwoNumbers(
                        new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1))))))))))),
                        new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1)))))))))))
                ));
    }

}
