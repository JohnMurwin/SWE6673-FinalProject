package thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CeilTest {
    @Test
    void testCeil() {
        assertEquals(2, Ceil.ceil(1.9));
    }
}
