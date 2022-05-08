package com.cict6thedition.BitManipulation.Q508DrawLine;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuestionTest {
    @Test
    void testComputeByteNum() {
        assertEquals(1, Question.computeByteNum(2, 2, 5));
    }
}
