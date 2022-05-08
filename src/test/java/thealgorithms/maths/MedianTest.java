package thealgorithms.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianTest {
    @Test
    void testMedian() {
        int testValues[] = {6,8};
        assertEquals(7, Median.median(testValues));
    }
}
