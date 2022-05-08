package thealgorithms.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AbsoluteMinTest {
    @Test
    void testGetMinValue() {
        assertEquals(1, AbsoluteMin.getMinValue(1,2,3));
    }
}
