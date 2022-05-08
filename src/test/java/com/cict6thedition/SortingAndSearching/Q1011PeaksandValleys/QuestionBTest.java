package com.cict6thedition.SortingAndSearching.Q1011PeaksandValleys;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuestionBTest {
    @Test
    void testMaxIndex() {    
        int[] testArr = new int[]{1, 4, 5, 8, 2};    
        assertEquals(2, QuestionB.maxIndex(testArr, 2, 4, 8));
    }
}
