package thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AliquotSumTest {
    @Test
    void testGetAliquotValue() {
        assertEquals(1, AliquotSum.getAliquotValue(5));
    }
}
