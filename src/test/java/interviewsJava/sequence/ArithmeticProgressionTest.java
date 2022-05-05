package interviewsJava.sequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticProgressionTest {

    @Test
    void sequenceTotalUsingLoop() {
        assertEquals(0, ArithmeticProgression.sequenceTotalUsingLoop(0,0));
        assertEquals(1, ArithmeticProgression.sequenceTotalUsingLoop(1,1));
        assertEquals(6, ArithmeticProgression.sequenceTotalUsingLoop(1,3));
        assertEquals(14950, ArithmeticProgression.sequenceTotalUsingLoop(100,100));
        assertEquals(-297, ArithmeticProgression.sequenceTotalUsingLoop(-100,3));
    }

    @Test
    void sequenceTotalUsingTriangularNumbers() {
        assertEquals(0, ArithmeticProgression.sequenceTotalUsingTriangularNumbers(0,0));
        assertEquals(1, ArithmeticProgression.sequenceTotalUsingTriangularNumbers(1,1));
        assertEquals(6, ArithmeticProgression.sequenceTotalUsingTriangularNumbers(1,3));
        assertEquals(14950, ArithmeticProgression.sequenceTotalUsingTriangularNumbers(100,100));
        assertEquals(-297, ArithmeticProgression.sequenceTotalUsingTriangularNumbers(-100,3));
    }
}