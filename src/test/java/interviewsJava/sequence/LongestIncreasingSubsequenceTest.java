package interviewsJava.sequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestIncreasingSubsequenceTest {

    @Test
    void getLongestIncreasingSubsequence()
    {
        int[] input = new int[]{1,2,3,4};
        int[] answer = new int[]{1,2,3,4};

        assertArrayEquals(answer, LongestIncreasingSubsequence.getLongestIncreasingSubsequence(input));
    }
}