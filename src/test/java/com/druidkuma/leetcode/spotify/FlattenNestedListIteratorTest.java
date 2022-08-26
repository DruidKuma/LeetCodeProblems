package com.druidkuma.leetcode.spotify;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 7/6/22
 */
class FlattenNestedListIteratorTest {

    @Test
    void test_example1() {
        FlattenNestedListIterator iterator = new FlattenNestedListIterator(List.of(
                getNestedListInt(List.of(1, 1)),
                getNestedInt(2),
                getNestedListInt(List.of(1, 1))
        ));
        assertEquals(1, iterator.next());
        assertEquals(1, iterator.next());
        assertEquals(2, iterator.next());
        assertEquals(1, iterator.next());
        assertEquals(1, iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    void test_example2() {
        FlattenNestedListIterator iterator = new FlattenNestedListIterator(List.of(getNestedListInt(List.of())));
        assertFalse(iterator.hasNext());
    }

    @Test
    void test_example3() {
        FlattenNestedListIterator iterator = new FlattenNestedListIterator(List.of(
                getNestedListInt(List.of()),
                getNestedListInt(List.of(3))
        ));
        assertEquals(3, iterator.next());
        assertFalse(iterator.hasNext());
    }

    private FlattenNestedListIterator.NestedInteger getNestedInt(int i) {
        return new FlattenNestedListIterator.NestedInteger() {
            @Override
            public boolean isInteger() {
                return true;
            }

            @Override
            public Integer getInteger() {
                return i;
            }

            @Override
            public List<FlattenNestedListIterator.NestedInteger> getList() {
                return null;
            }
        };
    }

    private FlattenNestedListIterator.NestedInteger getNestedListInt(List<Integer> ints) {
        return new FlattenNestedListIterator.NestedInteger() {
            @Override
            public boolean isInteger() {
                return false;
            }

            @Override
            public Integer getInteger() {
                return null;
            }

            @Override
            public List<FlattenNestedListIterator.NestedInteger> getList() {
                return ints.stream().map(i -> getNestedInt(i)).collect(Collectors.toList());
            }
        };
    }
}
