package thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AbsoluteMinTest {
    @Test
    void testGetMinValue() {
        assertEquals(1, AbsoluteMin.getMinValue(1,2,3));
    }
}
