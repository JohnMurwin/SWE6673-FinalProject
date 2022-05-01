package com.cict6thedition.BitManipulation.Q507PairwiseSwap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuestionTest {
    @Test
    void testCountOnes() {
        assertEquals(5, Question.swapOddEvenBits(10));
    }
}
