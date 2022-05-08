package com.cict6thedition.BitManipulation.Q506Conversion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuestionATest {
    @Test
    void testCountOnes() {
        assertEquals(1, QuestionA.bitSwapRequired(4, 6));
    }
}
