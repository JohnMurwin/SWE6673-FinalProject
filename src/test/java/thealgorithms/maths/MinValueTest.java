package thealgorithms.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinValueTest {
    @Test
    void testMin() {
        assertEquals(2, MinValue.min(2, 3));
    }
}
