package thealgorithms.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindMinTest {
    @Test
    void testFindMin() {
        int[] testMin = {1,2,3};
        assertEquals(1, FindMin.findMin(testMin));
    }
}
