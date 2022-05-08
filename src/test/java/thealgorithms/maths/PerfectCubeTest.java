package thealgorithms.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class PerfectCubeTest {
    @Test
    void testIsPerfectCube() {
        assertFalse(PerfectCube.isPerfectCube(9));
    }
}
