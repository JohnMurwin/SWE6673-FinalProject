package com.cict6thedition.SortingAndSearching.Q1003SearchinRotatedArray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuestionTest {
    @Test
    void testSearch() {
        int[] testArr = new int[]{1, 3, 4, 8};
        assertEquals(2, Question.search(testArr, 2));
    }
}
