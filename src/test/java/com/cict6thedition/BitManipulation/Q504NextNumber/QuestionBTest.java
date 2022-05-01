package com.cict6thedition.BitManipulation.Q504NextNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuestionBTest {
    @Test
    void testGetNext() {
        assertEquals(2561, QuestionB.getNext(2432));
    }
}
