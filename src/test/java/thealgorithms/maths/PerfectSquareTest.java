package thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PerfectSquareTest {
    @Test
    void testIsPerfectSquare() {
        assertTrue(PerfectSquare.isPerfectSquare(64));
    }
}
