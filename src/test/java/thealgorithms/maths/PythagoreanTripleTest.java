package thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class PythagoreanTripleTest {
    @Test
    void testIsPythagTriple() {
        assertFalse(PythagoreanTriple.isPythagTriple(3, 5, 9));
    }
}
