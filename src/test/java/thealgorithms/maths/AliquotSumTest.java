package thealgorithms.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AliquotSumTest {
    @Test
    void testGetAliquotValue() {
        assertEquals(1, AliquotSum.getAliquotValue(5));
    }
}
