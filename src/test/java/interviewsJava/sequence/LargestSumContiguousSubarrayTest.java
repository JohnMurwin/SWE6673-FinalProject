package interviewsJava.sequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestSumContiguousSubarrayTest {

    @Test
    void getLargestSumContiguousSubarray()
    {
        int[] input = new int[]{1,2,3,4,5,6,7};
        assertEquals(28, LargestSumContiguousSubarray.getLargestSumContiguousSubarray(input));
    }
}