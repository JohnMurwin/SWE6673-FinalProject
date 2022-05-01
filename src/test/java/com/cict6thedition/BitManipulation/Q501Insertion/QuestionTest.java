package com.cict6thedition.BitManipulation.Q501Insertion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuestionTest {
    @Test
    void testUpdateBits() {
        assertEquals(5, Question.updateBits(1, 1, 2, 4));
    }
}
