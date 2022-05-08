package thealgorithms.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AbsoluteValueTest {
    @Test
    void testGetAbsValue() {
        assertEquals(1, AbsoluteValue.getAbsValue(1));
    }
}
