package thealgorithms.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindMaxTest {
    @Test
    void testFindMax() {
        int[] testMax = {2,4,6};
        assertEquals(6, FindMax.findMax(testMax));
    }
}
