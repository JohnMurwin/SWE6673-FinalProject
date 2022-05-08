package interviewsJava.sequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubsequenceTest {

    @Test
    void getLongestPalindromeSubsequence()
    {
        assertEquals(2,LongestPalindromicSubsequence.getLongestPalindromeSubsequence("hello"));
        assertEquals(3,LongestPalindromicSubsequence.getLongestPalindromeSubsequence("lol"));
        assertEquals(7,LongestPalindromicSubsequence.getLongestPalindromeSubsequence("deified"));
        assertEquals(7,LongestPalindromicSubsequence.getLongestPalindromeSubsequence("racecar"));
        assertEquals(9,LongestPalindromicSubsequence.getLongestPalindromeSubsequence("redivider"));
    }
}