package thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class PerfectNumberTest {
    @Test
    void testIsPerfectNumber() {
        assertFalse(PerfectNumber.isPerfectNumber(5));
    }
}
