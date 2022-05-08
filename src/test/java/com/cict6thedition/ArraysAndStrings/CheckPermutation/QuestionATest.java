package com.cict6thedition.ArraysAndStrings.CheckPermutation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuestionATest {
    @Test
    void testPermutation() {
        assertEquals(true, QuestionA.permutation("abc", "abc"));
        assertEquals(true, QuestionA.permutation("abc", "cba"));
    }
}
