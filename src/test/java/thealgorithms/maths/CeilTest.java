package thealgorithms.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CeilTest {
    @Test
    void testCeil() {
        assertEquals(2, Ceil.ceil(1.9));
    }
}
