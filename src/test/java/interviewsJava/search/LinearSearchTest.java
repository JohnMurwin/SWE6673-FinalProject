package interviewsJava.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {

    @Test
    void find()
    {
        int[] input = new int[]{79 ,98 ,38 ,97 ,37 ,17 ,76 ,16 ,95 ,35 ,74 ,34 ,14 ,73 ,13 ,92 ,32 ,91 ,71 ,31 ,11 ,7 ,5 ,3 ,2};

        assertEquals(17, LinearSearch.find(91,input));
    }
}