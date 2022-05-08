package thealgorithms.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AbsoluteMaxTest {
    @Test
    void testGetMaxValue() {
        assertEquals(3, AbsoluteMax.getMaxValue(1,2,3));
    }
}
