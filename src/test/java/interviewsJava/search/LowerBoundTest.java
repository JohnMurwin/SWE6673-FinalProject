package interviewsJava.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowerBoundTest {

    @Test
    void lowerBound()
    {
        int[] input = new int[]{79 ,98 ,38 ,97 ,37 ,17 ,76 ,16 ,95 ,35 ,74 ,34 ,14 ,73 ,13 ,92 ,32 ,91 ,71 ,31 ,11 ,7 ,5 ,3 ,2};

        assertEquals(0, LowerBound.lowerBound(input,25, 2));

        input = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 47, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        assertEquals(0, LowerBound.lowerBound(input,25, 2));
        assertEquals(14, LowerBound.lowerBound(input,25, 47));
        assertEquals(24, LowerBound.lowerBound(input,25, 97));
        assertEquals(6, LowerBound.lowerBound(input,25, 14));
    }
}