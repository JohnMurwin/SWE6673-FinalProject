package com.cict6thedition.BitManipulation.Q502BinarytoString;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuestionTest {
    @Test
    void testPrintBinary() {
        assertEquals(".1", Question.printBinary(0.5));
    }
}
