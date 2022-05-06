package thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MinValueTest {
    @Test
    void testMin() {
        assertEquals(2, MinValue.min(2, 3));
    }
}
