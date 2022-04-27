package com.cict6thedition.ArraysAndStrings.IsUnique;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuestionATest {
    @Test
    void testIsUnique() {
        assertEquals(true, QuestionA.isUniqueChars("abc"));
        assertEquals(false, QuestionA.isUniqueChars("aab"));
    }
}
