package com.druidkuma.leetcode.topgoogle;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TextJustificationTest {

    private final TextJustification underTest = new TextJustification();

    @Test
    void test_example1() {
        assertEquals(
                Arrays.asList(
                        "This    is    an",
                        "example  of text",
                        "justification.  "
                ),
                underTest.fullJustify(new String [] {"This", "is", "an", "example", "of", "text", "justification."}, 16));
    }

    @Test
    void test_example2() {
        assertEquals(
                Arrays.asList(
                        "What   must   be",
                        "acknowledgment  ",
                        "shall be        "
                ),
                underTest.fullJustify(new String [] {"What","must","be","acknowledgment","shall","be"}, 16));
    }

    @Test
    void test_example3() {
        assertLinesMatch(
                Arrays.asList(
                        "Science  is  what we",
                        "understand      well",
                        "enough to explain to",
                        "a  computer.  Art is",
                        "everything  else  we",
                        "do                  "
                ),
                underTest.fullJustify(new String [] {"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"}, 20));
    }

}