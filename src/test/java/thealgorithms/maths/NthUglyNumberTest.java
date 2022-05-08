package thealgorithms.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NthUglyNumberTest {
    @Test
    void testGetNthUglyNo() {
        assertEquals(5, NthUglyNumber.getNthUglyNo(5));
    }
}
