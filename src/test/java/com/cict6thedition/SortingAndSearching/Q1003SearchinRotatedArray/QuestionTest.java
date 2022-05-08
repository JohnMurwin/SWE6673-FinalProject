package com.cict6thedition.SortingAndSearching.Q1003SearchinRotatedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuestionTest {
    @Test
    void testSearch() {
        int[] testArr = new int[]{1, 3, 4, 8};
        assertEquals(-1, Question.search(testArr, 2));
    }
}
