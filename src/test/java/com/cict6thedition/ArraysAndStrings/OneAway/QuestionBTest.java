package com.cict6thedition.ArraysAndStrings.OneAway;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuestionBTest {
    @Test
    void testOneAway() {
        assertEquals(true, QuestionB.oneEditAway("ab", "abc"));
    }
}