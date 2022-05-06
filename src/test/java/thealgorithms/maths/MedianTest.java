package thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MedianTest {
    @Test
    void testMedian() {
        int testValues[] = {6,8};
        assertEquals(7, Median.median(testValues));
    }
}
