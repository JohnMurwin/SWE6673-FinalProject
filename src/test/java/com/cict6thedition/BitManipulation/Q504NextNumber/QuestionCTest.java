package com.cict6thedition.BitManipulation.Q504NextNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuestionCTest {
    @Test
    void testGetNextArith() {
        assertEquals(8, QuestionC.getNextArith(4));
    }
}
