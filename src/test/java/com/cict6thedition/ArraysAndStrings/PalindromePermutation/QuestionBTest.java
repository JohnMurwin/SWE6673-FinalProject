package com.cict6thedition.ArraysAndStrings.PalindromePermutation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuestionBTest {
    @Test
    void testOneAway() {
        assertEquals(true, QuestionB.isPermutationOfPalindrome("aabbc"));
    }
}