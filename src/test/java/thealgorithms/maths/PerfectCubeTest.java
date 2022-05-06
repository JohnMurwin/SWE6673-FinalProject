package thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class PerfectCubeTest {
    @Test
    void testIsPerfectCube() {
        assertFalse(PerfectCube.isPerfectCube(9));
    }
}
