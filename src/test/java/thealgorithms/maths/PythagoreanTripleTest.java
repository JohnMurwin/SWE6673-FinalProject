package thealgorithms.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class PythagoreanTripleTest {
    @Test
    void testIsPythagTriple() {
        assertFalse(PythagoreanTriple.isPythagTriple(3, 5, 9));
    }
}
