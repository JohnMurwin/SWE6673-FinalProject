package thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AbsoluteValueTest {
    @Test
    void testGetAbsValue() {
        assertEquals(1, AbsoluteValue.getAbsValue(1));
    }
}
