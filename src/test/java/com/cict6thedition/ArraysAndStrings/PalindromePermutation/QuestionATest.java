package com.cict6thedition.ArraysAndStrings.PalindromePermutation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuestionATest {
    @Test
    void testIsPermutationOfPalindrome() {
        assertEquals(true, QuestionA.isPermutationOfPalindrome("aabbc"));
    }
}
