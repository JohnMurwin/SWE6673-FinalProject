package com.cict6thedition.SortingAndSearching.Q1002GroupAnagrams;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuestionBTest {
    @Test
    void testSortChars() {
        assertEquals("abc", QuestionB.sortChars("cba"));
    }
}
