package com.cict6thedition.SortingAndSearching.Q1011PeaksandValleys;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuestionBTest {
    @Test
    void testMaxIndex() {    
        int[] testArr = new int[]{1, 4, 5, 8, 2};    
        assertEquals(5, QuestionB.maxIndex(testArr, 2, 4, 8));
    }
}
