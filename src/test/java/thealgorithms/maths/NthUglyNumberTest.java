package thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NthUglyNumberTest {
    @Test
    void testGetNthUglyNo() {
        assertEquals(5, NthUglyNumber.getNthUglyNo(5));
    }
}
