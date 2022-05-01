package com.cict6thedition.SortingAndSearching.Q1001SortedMerge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuestionTest {
    @Test
    void testMerge() {
        int[] arrOne = {2, 3, 4, 5, 6, 8, 10, 100, 0, 0, 0, 0, 0, 0};
        int[] arrTwo = {1, 4, 7, 6, 7, 7};
        Question.merge(arrOne, arrTwo, 8, 6);
        assertEquals(new int[]{2, 3, 4, 5, 6, 8, 10, 100, 1, 4, 7, 6, 7, 7 }, arrOne);
    }
}
