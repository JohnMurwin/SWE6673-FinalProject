package thealgorithms.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class PerfectNumberTest {
    @Test
    void testIsPerfectNumber() {
        assertFalse(PerfectNumber.isPerfectNumber(5));
    }
}
