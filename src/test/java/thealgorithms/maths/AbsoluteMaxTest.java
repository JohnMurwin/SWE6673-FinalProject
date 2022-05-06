package thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AbsoluteMaxTest {
    @Test
    void testGetMaxValue() {
        assertEquals(3, AbsoluteMax.getMaxValue(1,2,3));
    }
}
