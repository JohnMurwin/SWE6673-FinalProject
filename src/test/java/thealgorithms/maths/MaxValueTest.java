package thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxValueTest {
    @Test
    void testMax() {
        assertEquals(3, MaxValue.max(2, 3));
    }
}
