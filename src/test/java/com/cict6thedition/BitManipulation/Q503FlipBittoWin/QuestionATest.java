package com.cict6thedition.BitManipulation.Q503FlipBittoWin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuestionATest {
    @Test
    void testGetBit() {
        assertEquals(true, QuestionA.getBit(2, 1));
    }
}
