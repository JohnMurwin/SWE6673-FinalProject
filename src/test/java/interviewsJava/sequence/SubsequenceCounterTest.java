package interviewsJava.sequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubsequenceCounterTest {

    @Test
    void getCount()
    {
        char[] sequence = new char[]{'G','e','e','k','s','f','o','r','G','e','e','k','s'};
        char[] subSequence = new char[]{'G','k','s'};
        assertEquals(4, SubsequenceCounter.getCount(sequence,subSequence));
    }
}