package com.druidkuma.leetcode.spotify;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 7/5/22
 */
class FindDuplicateFileInSystemTest {

    private final FindDuplicateFileInSystem underTest = new FindDuplicateFileInSystem();

    @Test
    void test_example1() {
        assertEquals(List.of(
                List.of("root/a/2.txt","root/c/d/4.txt","root/4.txt"),
                List.of("root/a/1.txt","root/c/3.txt")
        ), underTest.findDuplicate(new String[] {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"}));
    }

    @Test
    void test_example2() {
        assertEquals(List.of(
                List.of("root/a/2.txt","root/c/d/4.txt"),
                List.of("root/a/1.txt","root/c/3.txt")
        ), underTest.findDuplicate(new String[] {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)"}));
    }

}
