package interviewsJava.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpperBoundTest {

    @Test
    void upperBound()
    {
        int[] input = new int[]{79 ,98 ,38 ,97 ,37 ,17 ,76 ,16 ,95 ,35 ,74 ,34 ,14 ,73 ,13 ,92 ,32 ,91 ,71 ,31 ,11 ,7 ,5 ,3 ,2};

        assertEquals(0, UpperBound.upperBound(input,25, 2));

        input = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 47, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        assertEquals(1, UpperBound.upperBound(input,25, 2));
        assertEquals(16, UpperBound.upperBound(input,25, 47));
        assertEquals(25, UpperBound.upperBound(input,25, 97));
        assertEquals(6, UpperBound.upperBound(input,25, 14));
    }
}