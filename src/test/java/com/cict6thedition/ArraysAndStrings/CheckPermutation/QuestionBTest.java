package com.cict6thedition.ArraysAndStrings.CheckPermutation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuestionBTest {
    @Test
    void testPermutation() {
        assertEquals(true, QuestionB.permutation("abc", "abc"));
        assertEquals(false, QuestionB.permutation("abc", "abca"));
    }
}
