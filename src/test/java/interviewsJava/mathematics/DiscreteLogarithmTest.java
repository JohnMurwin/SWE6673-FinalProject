package interviewsJava.mathematics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscreteLogarithmTest {

    @Test
    void countDiscreteLogarithm()
    {
        assertEquals(-1, DiscreteLogarithm.countDiscreteLogarithm(1, 2, 3));
        assertEquals(0, DiscreteLogarithm.countDiscreteLogarithm(2, 3, 4));
        assertEquals(11, DiscreteLogarithm.countDiscreteLogarithm(100, 100, 100));
    }
}