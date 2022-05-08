package thealgorithms.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxValueTest {
    @Test
    void testMax() {
        assertEquals(3, MaxValue.max(2, 3));
    }
}
