package com.cict6thedition.ArraysAndStrings.OneAway;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuestionATest {
    @Test
    void testOneAway() {
        assertEquals(true, QuestionA.oneEditInsert("ab", "abc"));
    }
}
