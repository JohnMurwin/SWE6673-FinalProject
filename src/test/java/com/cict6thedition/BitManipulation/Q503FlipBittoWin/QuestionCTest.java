package com.cict6thedition.BitManipulation.Q503FlipBittoWin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuestionCTest {
    @Test
    void testGetMaxSequence() {
        int[] sequences = new int[3];
        sequences[0] = 1;
        sequences[1] = 2;
        sequences[2] = 3;
        assertEquals(4, QuestionC.getMaxSequence(sequences));
    }
}
