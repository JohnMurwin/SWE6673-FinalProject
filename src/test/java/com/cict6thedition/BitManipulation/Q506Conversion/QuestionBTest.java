package com.cict6thedition.BitManipulation.Q506Conversion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuestionBTest {
    @Test
    void testGetNext() {
        assertEquals(1, QuestionB.bitSwapRequired(4, 6));
    }
}
